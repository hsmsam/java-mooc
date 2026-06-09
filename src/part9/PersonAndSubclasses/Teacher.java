package part9.PersonAndSubclasses;

public class Teacher extends Person {
    private int salary;

    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    public String toString() {
        return super.getName() + "\n  " + super.getAddress() + "\n  " + "salary " + salary + " euro/month";
    }
}
