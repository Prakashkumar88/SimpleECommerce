package org.example.service;

import org.example.payment.PaymentMethod;

public interface ProductService {
    void buyProduct(int productId, double price, PaymentMethod paymentMethod);
}
