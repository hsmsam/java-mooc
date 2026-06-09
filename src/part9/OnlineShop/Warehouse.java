package part9.OnlineShop;

import java.util.*;

public class Warehouse {
    private Map<String, Integer> warehouse;
    private Map<String, Integer> warehouseStock;

    public Warehouse() {
        this.warehouse = new HashMap<>();
        this.warehouseStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        warehouse.put(product, price);
        warehouseStock.put(product, stock);
    }

    public int price(String product) {
        if (warehouse.containsKey(product)) {
            return warehouse.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (warehouseStock.containsKey(product)) {
            return warehouseStock.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        int stock;

        if (warehouseStock.containsKey(product)) {
            stock = warehouseStock.get(product);
            if (stock > 0) {
                stock -= 1;
                warehouseStock.put(product, stock);
                return true;
            }
        }
        return false;
    }

    public Set<String> products() {
        Set<String> products = new HashSet<>();

        for (String key : warehouse.keySet()) {
            products.add(key);
        }

        return products;
    }
}
