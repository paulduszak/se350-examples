package org.depaul.se350.strategy.order;

import org.depaul.se350.strategy.payment.PaymentStrategy;

public class OrderImpl implements Order {
    @Override
    public void processOrder(PaymentStrategy paymentStrategy) {
        paymentStrategy.processPayment();
    }
}
