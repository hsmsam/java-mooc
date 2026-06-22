package part12.MagicSquare;

public class MagicSquareFactory {
    public MagicSquare createMagicSquare(int size) {
        MagicSquare square = new MagicSquare(size);

        int x = size / 2; // column
        int y = 0;        // row

        for (int num = 1; num <= size * size; num++) {

            square.placeValue(x, y, num);

            int nextX = x + 1;
            int nextY = y - 1;

            // wrap top
            if (nextY < 0) {
                nextY = size - 1;
            }

            // wrap right
            if (nextX == size) {
                nextX = 0;
            }

            // if occupied → move down instead
            if (square.readValue(nextX, nextY) != 0) {
                nextX = x;
                nextY = y + 1;
            }

            x = nextX;
            y = nextY;
        }

        return square;
    }
}