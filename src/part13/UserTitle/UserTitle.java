package part13.UserTitle;

import javafx.application.Application;
import javafx.stage.Stage;

public class UserTitle extends Application {
    @Override
    public void start(Stage window) {
        Parameters params = getParameters();
        String title = params.getNamed().get("title");
        String name = params.getNamed().get("name");

//        String title = getParameters().getNamed().get("title");
//        String name = getParameters().getNamed().get("name");

        window.setTitle(title + ": " + name);
        window.show();
    }
}
