package part3;

public class ArrayPrinter {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        int i = 0;

        while (i < array.length - 1) {
            System.out.print(array[i] + ",");
            i++;
        }
        System.out.print(array[array.length - 1]);
    }
}
