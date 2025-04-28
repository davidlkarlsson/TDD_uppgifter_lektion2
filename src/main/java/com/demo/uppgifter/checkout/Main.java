package com.demo.uppgifter.checkout;

public class Main {
    public static void main(String[] args) {

        Item item1 = new Item("Laptop", 1000, 1);
        Item item2 = new Item("Phone", 500, 2);

        double totalBeforeDiscount = calculateTotalPrice(item1, item2);
        System.out.println("Total before discount: " + totalBeforeDiscount);

        Discount discount = new TenPercentDiscount();
        double totalAfterDiscount = discount.applyDiscount(totalBeforeDiscount);
        System.out.println("Total after discount: " + totalAfterDiscount);
}

    public static double calculateTotalPrice(Item... items) {
        double total = 0;
        for (Item item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }
}
