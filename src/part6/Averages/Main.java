package part6.Averages;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeRegister register = new GradeRegister();

        UserInterface newUI = new UserInterface(register, scanner);
        newUI.start();
    }
}
