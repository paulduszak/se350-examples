package org.depaul.se350.strategy.payment;

public class Paypal implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Processing payment using PayPal.");
    }
}
