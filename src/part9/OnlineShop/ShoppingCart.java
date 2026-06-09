package part9.OnlineShop;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> cart = new HashMap<>();

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    public void add(String product, int price) {
        int quantity = 1;
        if (cart.containsKey(product)) {
            cart.get(product).increaseQuantity();
        }
        cart.putIfAbsent(product, new Item(product, quantity, price));
    }

    public int price() {
        int totalPrice = 0;

        for (Item product : cart.values()) {
            totalPrice += product.price();
        }
        return totalPrice;
    }

    public void print() {
        for (Item item : cart.values()) {
            System.out.println(item.toString());
        }
    }
}
