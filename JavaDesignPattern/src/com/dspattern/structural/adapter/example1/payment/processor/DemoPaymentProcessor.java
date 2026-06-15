package com.dspattern.structural.adapter.example1.payment.processor;

import java.math.BigDecimal;

/**
 * Concrete implementation (DemoPaymentProcessor)
 *
 * Implements the PaymentProcessor interface directly
 * This simulates an in-house payment processor
 * Showing that no adapter is needed when the API already matches
 * the Target common interface
 */
public class DemoPaymentProcessor implements PaymentProcessor {
    @Override
    public void pay(BigDecimal amount) {

        // Direct implementation  - no translation / conversion needed
        System.out.println("Processing Demo Payment of: "+amount);
    }
}
