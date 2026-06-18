package part11.FlightControl;

import part11.FlightControl.logic.FlightControl;
import part11.FlightControl.ui.TextUI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlightControl flightControl = new FlightControl();

        TextUI ui = new TextUI(flightControl, scanner);
        ui.start();
    }
}
