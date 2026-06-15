package com.dspattern.structural.adapter.example1.payment.processor;

import java.math.BigDecimal;

/**
 * Target Interface (PaymentProcessor)
 * <p>
 * Defines the standard interface expected by the client (PaymentService)
 * All adapters will implement this interface to make compatible APIs work
 */
public interface PaymentProcessor {

    void pay(BigDecimal amount);
}
