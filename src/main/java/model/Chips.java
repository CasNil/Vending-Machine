package model;

public class Chips extends Product {

    private String flavour;

    private boolean isPotatoChips;

    public Chips(int id, double price, String productName, String flavour, boolean isPotatoChips) {
        super(id, price, productName);
        this.flavour = flavour;
        this.isPotatoChips = isPotatoChips;
    }

    @Override
    public String examine() {
        return "Id: " + getId() + ", " + "Product Name: " + getProductName() + ", " + "Price: " + getPrice() + ", " + "Type: " + this.flavour  + ", " + "Contains Sugar: " + isPotatoChips;
    }

    @Override
    public String use() {
        return "Product Name: " + getProductName() + ", " + "Type: " + this.flavour;
    }
}