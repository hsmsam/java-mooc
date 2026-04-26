package part3;

import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> newList = new ArrayList<>();


        while (true) {
            String name = scanner.nextLine();
            newList.add(name);
            if (name == "") {
                System.out.println(newList.get(2));
                break;
            }
        }
    }
}
