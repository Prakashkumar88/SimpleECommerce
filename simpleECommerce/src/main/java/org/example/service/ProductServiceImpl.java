package org.example.service;

import org.example.payment.PaymentMethod;
import org.example.repository.ProductRepository;
import org.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Now, instead of a fixed PaymentMethod bean, we pass it dynamically
    @Override
    public void buyProduct(int productId, double price, PaymentMethod paymentMethod) {
        String product = productRepository.getProductById(productId);
        System.out.println("🛒 Buying product: " + product);
        paymentMethod.pay(price);
    }
}
