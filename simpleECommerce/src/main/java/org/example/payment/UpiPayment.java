package org.example.payment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("upiPayment")
@Primary
public class UpiPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("📱 Payment of ₹" + amount + " done via UPI.");
    }
}
