package org.depaul.se350.strategy.order;

import org.depaul.se350.strategy.payment.PaymentStrategy;

public interface Order {
    void processOrder(PaymentStrategy paymentStrategy);
}
