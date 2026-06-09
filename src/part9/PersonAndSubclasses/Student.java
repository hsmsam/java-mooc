package part9.PersonAndSubclasses;

public class Student extends Person {
    private int studyCredits;

    public Student(String name, String address) {
        super(name, address);
        this.studyCredits = 0;
    }

    public void study() {
        studyCredits++;
    }

    public int credits() {
        return studyCredits;
    }

    public String toString() {
        return super.getName() + "\n  " + super.getAddress() + "\n  Study credits " + credits();
    }
}
