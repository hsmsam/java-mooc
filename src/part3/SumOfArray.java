package part3;

public class SumOfArray {
    public static void main(String[] args) {
        int[] numbers = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(numbers));
    }

    public static int sumOfNumbersInArray(int[] array) {
        int i = 0;
        int sum = 0;

        while (i < array.length) {
            sum += array[i];
            i++;
        }
        return sum;
    }
}
