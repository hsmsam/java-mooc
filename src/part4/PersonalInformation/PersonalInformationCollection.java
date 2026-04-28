package part4.PersonalInformation;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<PersonalInformation> persons = new ArrayList<>();

        while (true) {
            System.out.print("First name: ");
            String firstName = scanner.nextLine();

            if (firstName.isEmpty()) {
                break;
            }

            System.out.print("Last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Identification number: ");
            String identificationNumber = scanner.nextLine();

            persons.add(new PersonalInformation(firstName, lastName, identificationNumber));
        }

        System.out.println("");

        for (PersonalInformation person : persons) {
            System.out.println(person.getFirstName() + " " + person.getSurName());
        }
    }
}
