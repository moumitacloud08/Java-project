package com.dspattern.structural.adapter.example1.payment.processor.adaptee;

import java.math.BigDecimal;

/**
 * Adaptee (PayPalSDK)
 * <p>
 * Represents a third-party payPalAPI with incompatible methods
 * <p>
 * The PayPalAdapter will convert our app's params into suitable params for PayPal APIs
 */
public class PayPalSDK {

    //PayPal expects a BigDecimal amount and an explicit currency code
    public void sendPayment(BigDecimal amount, String currencyCode){

        //Note: API operates an BigDecimal for money to avoid floating-point issue
        System.out.println("[third-party payPalAPI] Processing Paypal payment of "+amount+" "+currencyCode);
    }
}
