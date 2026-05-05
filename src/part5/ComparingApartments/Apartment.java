package part5.ComparingApartments;

public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;
    private int absoluteValue;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        absoluteValue = pricePerSquare * squares;
        int priceDifference = 0;
        int comparedAbsoluteValue = compared.squares * compared.pricePerSquare;

        priceDifference = absoluteValue - comparedAbsoluteValue;

        return priceDifference;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        absoluteValue = pricePerSquare * squares;
        int comparedAbsoluteValue = compared.squares * compared.pricePerSquare;

        if (absoluteValue > comparedAbsoluteValue) {
            return true;
        }

        return false;
    }
}
