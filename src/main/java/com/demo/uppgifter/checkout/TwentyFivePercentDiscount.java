package com.demo.uppgifter.checkout;

public class TwentyFivePercentDiscount implements Discount {
    @Override
    public double applyDiscount(double total) {
        return total * 0.75;
    }
}
