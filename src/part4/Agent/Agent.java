package part4.Agent;

public class Agent {
    String firstName;
    String lastName;

    public Agent(String first, String last) {
        this.firstName = first;
        this.lastName = last;
    }

    public String toString() {
        return "My name is " + lastName + ", " + firstName + " " + lastName;
    }
}
