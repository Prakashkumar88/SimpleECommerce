package org.example.payment;

import org.springframework.stereotype.Component;

@Component("creditCardPayment")
public class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("💳 Payment of ₹" + amount + " done via Credit Card.");
    }
}
