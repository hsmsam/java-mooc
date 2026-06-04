package part8.HashForDate;

public class Main {
    public static void main(String[] args) {
        SimpleDate d1 = new SimpleDate(1, 1, 2000);
        SimpleDate d2 = new SimpleDate(1, 1, 2000);
        SimpleDate d3 = new SimpleDate(2, 1, 2000);

        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());
        System.out.println(d3.hashCode());
    }
}
