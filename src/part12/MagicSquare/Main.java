package part12.MagicSquare;

public class Main {
    public static void main(String[] args) {
        MagicSquareFactory factory = new MagicSquareFactory();

        // Create a 3x3 magic square
        MagicSquare square = factory.createMagicSquare(3);

        System.out.println("Magic Square:");
        System.out.println(square);

        System.out.println("Row sums: " + square.sumsOfRows());
        System.out.println("Column sums: " + square.sumsOfColumns());
        System.out.println("Diagonal sums: " + square.sumsOfDiagonals());

        System.out.println("All numbers different: " + square.allNumbersDifferent());
        System.out.println("Sums are same: " + square.sumsAreSame());
        System.out.println("Is magic square: " + square.isMagicSquare());
    }
}
