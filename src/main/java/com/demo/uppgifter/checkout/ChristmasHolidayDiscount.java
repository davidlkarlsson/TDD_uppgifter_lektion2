package com.demo.uppgifter.checkout;

public class ChristmasHolidayDiscount implements Discount{


    @Override
    public double applyDiscount(double total) {
        return total * 0.6; // 40% discount
    }
}
