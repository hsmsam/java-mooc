package part4.Product;

import part3.Printer;

public class Product {
    private String name;
    private double price = 0;
    private int quantity = 0;

    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }

    public void printProduct() {
        System.out.println(name + ", price " + price + ", " + quantity + " pcs");
    }
}
