package part11.FirstPackages.mooc;

import part11.FirstPackages.mooc.logic.ApplicationLogic;
import part11.FirstPackages.mooc.ui.TextInterface;
import part11.FirstPackages.mooc.ui.UserInterface;

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new TextInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
