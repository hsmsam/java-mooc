package part14.Asteroids;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class AsteroidsApplication extends Application {

    public static int WIDTH = 300;
    public static int HEIGHT = 200;

    @Override
    public void start(Stage window) throws Exception {
        Pane pane = new Pane();
        pane.setPrefSize(WIDTH, HEIGHT);

        Text text = new Text(10, 20, "Points: 0");
        pane.getChildren().add(text);

        AtomicInteger points = new AtomicInteger();

        Ship ship = new Ship(WIDTH / 2, HEIGHT / 2);
        List<Asteroid> asteroids = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            Asteroid asteroid = new Asteroid(random.nextInt(WIDTH), random.nextInt(HEIGHT));
            asteroids.add(asteroid);
        }

        pane.getChildren().add(ship.getCharacter());
        asteroids.forEach(asteroid -> pane.getChildren().add(asteroid.getCharacter()));

        Scene scene = new Scene(pane);

        Map<KeyCode, Boolean> pressedKeys = new HashMap<>();
        Map<KeyCode, Boolean> previousKeys = new HashMap<>();

        scene.setOnKeyPressed(event -> {
            pressedKeys.put(event.getCode(), Boolean.TRUE);
        });

        scene.setOnKeyReleased(event -> {
            pressedKeys.put(event.getCode(), Boolean.FALSE);
        });

        List<Projectile> projectiles = new ArrayList<>();

        new AnimationTimer() {

            @Override
            public void handle(long now) {

                if (pressedKeys.getOrDefault(KeyCode.LEFT, false)) {
                    ship.turnLeft();
                }

                if (pressedKeys.getOrDefault(KeyCode.RIGHT, false)) {
                    ship.turnRight();
                }

                if (pressedKeys.getOrDefault(KeyCode.UP, false)) {
                    ship.accelerate();
                }

                if (pressedKeys.getOrDefault(KeyCode.SPACE, false)
                        && !previousKeys.getOrDefault(KeyCode.SPACE, false)
                        && projectiles.size() < 3) {

                    Projectile projectile = new Projectile(
                            (int) ship.getCharacter().getTranslateX(),
                            (int) ship.getCharacter().getTranslateY()
                    );

                    projectile.getCharacter().setRotate(ship.getCharacter().getRotate());

                    projectile.accelerate();
                    projectile.setMovement(projectile.getMovement().normalize().multiply(3));

                    projectiles.add(projectile);
                    pane.getChildren().add(projectile.getCharacter());
                }

                projectiles.forEach(projectile -> {
                    asteroids.forEach(asteroid -> {
                        if (projectile.collide(asteroid)) {
                            projectile.setAlive(false);
                            asteroid.setAlive(false);

                            points.addAndGet(100);
                            text.setText("Points: " + points);
                        }
                    });
                });

                projectiles.stream()
                        .filter(projectile -> !projectile.isAlive())
                        .forEach(projectile -> pane.getChildren().remove(projectile.getCharacter()));
                projectiles.removeAll(projectiles.stream()
                        .filter(projectile -> !projectile.isAlive())
                        .collect(Collectors.toList()));

                asteroids.stream()
                        .filter(asteroid -> !asteroid.isAlive())
                        .forEach(asteroid -> pane.getChildren().remove(asteroid.getCharacter()));
                asteroids.removeAll(asteroids.stream()
                        .filter(asteroid -> !asteroid.isAlive())
                        .collect(Collectors.toList()));

                if (Math.random() < 0.005) {
                    Asteroid asteroid = new Asteroid(
                            random.nextInt(WIDTH),
                            random.nextInt(HEIGHT)
                    );
                    if (!asteroid.collide(ship)) {
                        asteroids.add(asteroid);
                        pane.getChildren().add(asteroid.getCharacter());
                    }
                }

                previousKeys.putAll(pressedKeys);
                ship.move();
                asteroids.forEach(asteroid -> asteroid.move());
                projectiles.forEach(projectile -> projectile.move());
            }
        }.start();

        window.setTitle("Asteroids!");
        window.setScene(scene);
        window.show();
    }

    public static int partsCompleted() {
        return 4;
    }

    public static void main(String[] args) {
        launch(AsteroidsApplication.class);
    }
}
