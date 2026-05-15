package part6.JokeManager;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class JokeManager {
    ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        jokes.add(joke);
    }

    public String drawJoke() {
        if (jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
        Random draw = new Random();
        return jokes.get(draw.nextInt(jokes.size()));
    }

    public void printJokes() {
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}
