package part2;

public class AdvancedAstrology {
    public static void main(String[] args) {
        christmasTree(4);
//        printTriangle(4);
    }

    public static void printStars(int number) {
        int i = 0;

        while (i < number) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        int i = 0;

        while (i < number) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int number) {
        int i = 0;
        int x = 1;
        int whitespaces = number - 1;

        while (i < number) {
            printSpaces(whitespaces);
            printStars(x);
            i++;
            x++;
            whitespaces--;
        }
    }

    public static void christmasTree(int height) {
        int i = 1;
        int x = height;
        int j = 1;


        while (i <= height) {
            printSpaces(x);
            printStars(j);
            i++;
            x--;
            j = j + 2;
        }
        printSpaces(height - 1);
        printStars(3);
        printSpaces(height - 1);
        printStars(3);
    }
}
