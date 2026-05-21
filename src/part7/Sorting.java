package part7;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        Sorting.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallestNumber = array[0];

        for (int i = 0; i < array.length; i++) {
            if (smallestNumber > array[i]) {
                smallestNumber = array[i];
            }
        }
        return smallestNumber;
    }

    public static int indexOfSmallest(int[] array) {
        int smallestIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[smallestIndex] > array[i]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestIndexFrom = startIndex;

        for (int i = startIndex; i < table.length; i++) {
            if (table[smallestIndexFrom] > table[i]) {
                smallestIndexFrom = i;
            }
        }
        return smallestIndexFrom;
    }

    public static void swap(int[] array, int index1, int index2) {
        int helper = array[index1];

        array[index1] = array[index2];
        array[index2] = helper;
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            int smallestIndex = indexOfSmallestFrom(array, i);
            swap(array, i, smallestIndex);
            System.out.println(Arrays.toString(array));
        }
    }
}
