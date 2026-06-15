package com.dspattern.structural.adapter.example1;

import com.dspattern.structural.adapter.example1.payment.processor.DemoPaymentProcessor;
import com.dspattern.structural.adapter.example1.payment.processor.PaymentProcessor;
import com.dspattern.structural.adapter.example1.payment.processor.adaptee.PayPalSDK;
import com.dspattern.structural.adapter.example1.payment.processor.adapter.PayPalAdapter;
import com.dspattern.structural.adapter.example1.payment.service.PaymentService;

import java.math.BigDecimal;

/**
 * Demo Client (MainApp)
 * <p>
 * Demonstrates the Adapter pattern by processing payments
 * using Demo, Stripe and Paypal Providers.
 * <p>
 * shows how new providers can be added without changing client code
 */
public class MainApp {
    public static void main(String[] args){

        PaymentService paymentService = new PaymentService();

        //Demo...no adapter needed
        PaymentProcessor demo = new DemoPaymentProcessor();
        paymentService.processPayment(demo,new BigDecimal("100.00"));

        System.out.println();

        // PayPal (BigDecimal + currency)
        PaymentProcessor payPal = new PayPalAdapter(new PayPalSDK());
        paymentService.processPayment(payPal,new BigDecimal("125.00"));
    }
}
