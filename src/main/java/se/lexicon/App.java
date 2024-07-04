package se.lexicon;

import model.*;

public class App {
    public static void main(String[] args) {
        Product[] products = {
                new Beverage(1, 3, "Coca Cola", "Soda", true),
                new Beverage(2, 3, "Coca Cola Zero", "Soda", false),
                new Candy(3, 2.5, "Lollipop", "Sweet Candy", false),
                new Candy(4, 3.5, "Toblerone", "Chocolate", true),
                new Chips(5, 3.5, "Pringles", "Sourcream & Onion", true),
                new Chips(6, 4, "Truffle Chips", "Truffle", true)
        };
        VendingMachine vendingMachine = new VendingMachineImpl(products);

        for (String string : vendingMachine.getProducts()) {
            System.out.println(string);
            System.out.println("-----");
        }
        vendingMachine.addCurrency(100);
        Product cola = vendingMachine.request(1);
        System.out.println(cola.use());
        Product TruffleChips = vendingMachine.request(6);
        System.out.println(TruffleChips.use());
        System.out.println(vendingMachine.getBalance());
    }
}
