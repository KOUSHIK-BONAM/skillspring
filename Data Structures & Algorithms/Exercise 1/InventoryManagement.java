//Exercise 1: Inventory Management System

import java.util.HashMap;

class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    Product(int id, String name, int qty, double price) {
        this.productId = id;
        this.productName = name;
        this.quantity = qty;
        this.price = price;
    }

    public String toString() {
        return productId + " " + productName + " Qty:" + quantity + " Price:" + price;
    }
}

public class InventoryManagement {

    static HashMap<Integer, Product> inventory = new HashMap<>();

    static void addProduct(Product p) {
        inventory.put(p.productId, p);
    }

    static void updateProduct(int id, int qty) {
        if (inventory.containsKey(id))
            inventory.get(id).quantity = qty;
    }

    static void deleteProduct(int id) {
        inventory.remove(id);
    }

    static void display() {
        for(Product p : inventory.values())
            System.out.println(p);
    }

    public static void main(String[] args) {

        addProduct(new Product(101,"Laptop",20,55000));
        addProduct(new Product(102,"Mouse",100,500));

        System.out.println("Inventory:");
        display();

        updateProduct(101,30);

        deleteProduct(102);

        System.out.println("\nUpdated Inventory:");
        display();
    }
}