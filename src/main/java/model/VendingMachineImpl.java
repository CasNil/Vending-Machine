package model;

import java.util.Arrays;
import java.util.List;

public class VendingMachineImpl implements VendingMachine {

    private Product[] products;

    private int depositPool;

    public VendingMachineImpl(Product[] products) {
        this.products = products;
    }

    private static final List<Integer> ACCEPTED_AMOUNT = Arrays.asList(1, 2, 5, 10, 20, 50, 100, 200, 500, 1000);

    @Override
    public void addCurrency(double amount) {

    }

    @Override
    public int getBalance() {
        int balance = 0;
        if (depositPool > 0) {
            balance = depositPool;
        }
        return balance;
    }

    @Override
    public Product request(int id) {
        if (id < 0) {
            throw new IllegalArgumentException("Id is not allowed to be less than 0");
        }
        for (Product product : products) {
            if (product.getId() == id && product.getPrice() <= depositPool) {
                depositPool = depositPool - (int) product.getPrice();
                return product;
            }
        }
        return null;
    }

    @Override
    public int endSession() {
        int currentDepositPool = depositPool;
        depositPool = 0;
        return currentDepositPool;
    }

    @Override
    public String getDescription(int id) {
        String description = "";
        for (Product product : products) {
            if (product.getId() == id) {
                description = product.examine();
            }
        }
        return description;
    }

    @Override
    public String[] getProducts() {
        String[] productString = new String[products.length];
        for (int i = 0; i < products.length; i++) {
            productString[i] = "id: " + products[i].getId() + ", " + "Product Name" + products[i].getProductName() + ", " + "Price: " + products[i].getPrice();
        }
        return productString;
    }
}
