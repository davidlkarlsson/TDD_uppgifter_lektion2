package com.demo.uppgifter.checkout;

public class Main {
    public static void main(String[] args) {

        Item item1 = new Item("Laptop", 1000, 1);
        Item item2 = new Item("Phone", 500, 2);

        ShoppingCart shoppingCart = new ShoppingCart(new Discount() {
            @Override
            public double applyDiscount(double total) {
                return total * 0.9;
            }
        });

        ShoppingCart shoppingCart2 = new ShoppingCart(new ChristmasHolidayDiscount());

        double totalBeforeDiscount = calculateTotalPrice(item1, item2);
        System.out.println("Total before discount: " + totalBeforeDiscount);

        //Discount discount = new TenPercentDiscount();
        double totalAfterDiscount = shoppingCart2.calculateTotal(totalBeforeDiscount);
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
