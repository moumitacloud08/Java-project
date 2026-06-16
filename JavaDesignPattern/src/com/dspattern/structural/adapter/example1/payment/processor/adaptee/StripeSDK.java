package com.dspattern.structural.adapter.example1.payment.processor.adaptee;

import java.math.BigDecimal;

/**
 * Adaptee (StripeSDK)
 * <p>
 * Represents the Stripe paymentAPI with an incompatible method signature
 * <p>
 * The StripeAdapter converts our app's dollars into cents expected here
 */
public class StripeSDK {

    //Stripe expects payment in cents, not dollars
    public void makePayment(long cents) {
        System.out.println("[third-party stripeAPI] Processing Stripes payment amount: " +
                new BigDecimal(cents).movePointLeft(2).toPlainString());
    }
}
