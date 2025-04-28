package com.demo.uppgifter.checkout;

public class TenPercentDiscount implements Discount {

    // apply 10 % discount
    @Override
    public double applyDiscount(double total) {
        return (total * 0.9);
    }
}
