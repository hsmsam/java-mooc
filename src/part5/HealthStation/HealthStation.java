package part5.HealthStation;

public class HealthStation {
    private int counter = 0;

    public int weight(Person person) {
        int weight = person.getWeight();
        counter += 1;
        return weight;
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        return counter;
    }
}
