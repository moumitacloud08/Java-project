package com.dspattern.structural.adapter.example1.payment.processor.adapter;

import com.dspattern.structural.adapter.example1.payment.processor.PaymentProcessor;
import com.dspattern.structural.adapter.example1.payment.processor.adaptee.StripeSDK;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Adapter (StripeAdapter)
 * <p>
 * Implements PaymentProcessor and bridges our app with StripeSDK
 * <p>
 * Converts BidDecimal amounts into cents since Stripe expects minor units
 */
public class StripeAdapter implements PaymentProcessor {

    //Reference to the adaptee
    private StripeSDK stripeSDK;

    public StripeAdapter(StripeSDK stripeSDK) {
        this.stripeSDK = stripeSDK;
    }

    @Override
    public void pay(BigDecimal amount) {

        //Normalize to 2 decimal s, then converts to cents exactly
        BigDecimal scaled = amount.setScale(2, RoundingMode.HALF_UP);
        long cents = scaled.movePointRight(2).longValueExact();

        System.out.println("[StripeAdapter] Converting " + scaled + " -> " + cents + " cents for stripe.");
        stripeSDK.makePayment(cents);
    }
}
