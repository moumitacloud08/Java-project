package com.dspattern.structural.adapter.example1.payment.processor.adapter;

import com.dspattern.structural.adapter.example1.payment.processor.PaymentProcessor;
import com.dspattern.structural.adapter.example1.payment.processor.adaptee.PayPalSDK;

import java.math.BigDecimal;

/**
 * Adapter (PayPalAdapter)
 * <p>
 * Implements PaymentProcessor and bridges our app with PayPal SDK
 * <p>
 * Converts BigDecimal amounts and adds the required currency code
 */
public class PayPalAdapter implements PaymentProcessor {

    //Reference to the adaptee
    private final PayPalSDK payPalSDK;

    public PayPalAdapter(PayPalSDK payPalSDK) {
        this.payPalSDK = payPalSDK;
    }

    @Override
    public void pay(BigDecimal amount) {

        System.out.println("[PayPalAdapter] Forwarding payment for "+ amount+" with currency USD");

        payPalSDK.sendPayment(amount,"USD");
    }
}
