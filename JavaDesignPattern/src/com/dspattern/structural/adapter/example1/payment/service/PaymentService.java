package com.dspattern.structural.adapter.example1.payment.service;

import com.dspattern.structural.adapter.example1.payment.processor.PaymentProcessor;

import java.math.BigDecimal;

/**
 * Client (PaymentService)
 * <p>
 * Uses the PaymentProcessor interface to process payments
 * It is unaware of the underlying payment process or adapter
 */
public class PaymentService {

    public void processPayment(PaymentProcessor paymentProcessor, BigDecimal amount) {
        paymentProcessor.pay(amount);
    }
}
