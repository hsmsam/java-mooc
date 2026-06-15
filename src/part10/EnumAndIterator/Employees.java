package part10.EnumAndIterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Employees {
    List<Person> employees = new ArrayList<>();

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        employees.addAll((Collection<? extends Person>) peopleToAdd);
    }

    public void print() {
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            Person nextEmployee = iterator.next();
            System.out.println(nextEmployee);
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            Person nextEmployee = iterator.next();
            if (nextEmployee.getEducation().equals(education)) {
                System.out.println(nextEmployee);
            }
        }
    }

    public void fire(Education education) {
        employees.removeIf(person -> person.getEducation().equals(education));
    }
}
