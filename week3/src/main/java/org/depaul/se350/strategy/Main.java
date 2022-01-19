package org.depaul.se350.strategy;

import org.depaul.se350.strategy.order.Order;
import org.depaul.se350.strategy.order.OrderImpl;
import org.depaul.se350.strategy.payment.CreditCard;
import org.depaul.se350.strategy.payment.PaymentStrategy;
import org.depaul.se350.strategy.payment.Paypal;

public class Main {
    public static void main(String[] args) {

        // Use a factory to create a PaymentStrategy instead of direct instantiation
        PaymentStrategy paypal = new Paypal();
        PaymentStrategy creditCard = new CreditCard();

        Order order1 = new OrderImpl();
        Order order2 = new OrderImpl();

        // Offer user a choice between payment strategies

        order1.processOrder(paypal);
        order2.processOrder(creditCard);
    }
}
