package part2;

public class FromParameterToOne {
    public static void main(String[] args) {
        printFromNumberToOne(2);
    }

    public static void printFromNumberToOne(int number) {
        int i = 1;

        while (number >= i) {
            System.out.println(number);
            number--;
        }
    }
}
