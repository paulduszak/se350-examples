package org.depaul.se350.strategy.payment;

public class CreditCard implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Processing payment using credit card.");
    }
}
