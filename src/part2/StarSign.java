package part2;

public class StarSign {
    public static void main(String[] args) {
        printTriangle(4);
    }

    public static void printStars(int number) {
        int i = 0;
        while (i < number) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }

    public static void printSquare(int number) {
        int i = 0;
        while (i < number) {
            printStars(number);
            i++;
        }
    }

    public static void printRectangle(int width, int height) {
        int i = 0;

        while (i < height) {
            printStars(width);
            i++;
        }
    }

    public static void printTriangle(int size) {
        int i = 0;
        int x = 0;

        while (i <= size) {
            printStars(x);
            i++;
            x++;
        }
    }
}
