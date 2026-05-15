package part6.TodoList;

import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    TodoList list;

    public UserInterface(Scanner scanner, TodoList list) {
        this.scanner = scanner;
        this.list = list;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.print("To add: ");
                String task = scanner.nextLine();
                list.add(task);
            } else if (command.equals("list")) {
                list.print();
            } else if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int remove = Integer.valueOf(scanner.nextLine());
                list.remove(remove);
            }
        }
    }
}
