package model;

public abstract class Product {
    private final int id;
    private double price;
    private String productName;


    public Product(int id, double price, String productName) {
        this.id = id;
        this.price = price;
        this.productName = productName;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }


    public String getProductName() {
        return productName;
    }

    public abstract String examine();

    public abstract String use();
}
