package part5.OverloadedCounter;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(10);
        Counter counter1 = new Counter();

        counter.increase(10);
        counter.increase(5);
        counter.increase(-2);
        counter.increase(1);

        counter1.increase(5);
        counter1.increase(5);
        counter1.increase(5);
        counter1.decrease(10);

        System.out.println("Counter: " + counter.value());
        System.out.println("Counter 1: " + counter1.value());
    }
}
