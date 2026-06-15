package part10.StudentsOnAlphabeticalOrder;

public class Main {
    public static void main(String[] args) {
        Student first = new Student("jamo");
        Student second = new Student("jamo1");
        System.out.println(first.compareTo(second));
    }
}
