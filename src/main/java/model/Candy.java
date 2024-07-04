package model;

public class Candy extends Product {

    private String type;

    private boolean isSoftCandy;

    public Candy(int id, double price, String productName, String type, boolean isSoftCandy) {
        super(id, price, productName);
        this.type = type;
        this.isSoftCandy = isSoftCandy;
    }

    @Override
    public String examine() {
        return "Id: " + getId() + ", " + "Product Name: " + getProductName() + ", " + "Price: " + getPrice() + ", " + "Type: " + this.type + ", " + "Is soft candy: " + isSoftCandy;
    }

    @Override
    public String use() {
        return "Product Name: " + getProductName() + ", " + "Type: " + this.type;
    }
}
