package model;

public class Beverage extends Product {

    private String type;

    private boolean containsSugar;

    public Beverage(int id, double price, String productName, String type, boolean containsSugar) {
        super(id, price, productName);
        this.type = type;
        this.containsSugar = containsSugar;
    }

    @Override
    public String examine() {
        return "Id: " + getId() + ", " + "Product Name: " + getProductName() + ", " + "Price: " + getPrice() + ", " + "Type: " + this.type  + ", " + "Contains Sugar: " + containsSugar;
    }

    @Override
    public String use() {
        return "Product Name: " + getProductName() + ", " + "Type: " + this.type;
    }
}
