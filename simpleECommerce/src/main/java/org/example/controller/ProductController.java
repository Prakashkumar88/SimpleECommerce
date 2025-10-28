package org.example.controller;

import org.example.payment.PaymentMethod;
import org.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class ProductController {

    private final ProductService productService;
    private final ApplicationContext context;

    @Autowired
    public ProductController(ProductService productService, ApplicationContext context) {
        this.productService = productService;
        this.context = context;
    }

    public void startShopping() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🛍 Welcome to Simple E-Commerce!");
        System.out.println("Choose a product to buy:");
        System.out.println("1) Laptop - ₹79999");
        System.out.println("2) Smartphone - ₹49999");
        System.out.println("3) Headphones - ₹2999");
        System.out.print("Enter product ID: ");
        int productId = scanner.nextInt();

        System.out.println("\nSelect Payment Method:");
        System.out.println("1) UPI");
        System.out.println("2) Credit Card");
        System.out.print("Enter choice (1/2 or name): ");
        String paymentChoice = scanner.next().trim().toLowerCase();

        PaymentMethod paymentMethod = switch (paymentChoice) {
            case "1", "upi" -> context.getBean("upiPayment", PaymentMethod.class);
            case "2", "credit", "creditcard" -> context.getBean("creditCardPayment", PaymentMethod.class);
            default -> {
                System.out.println("Invalid choice! Defaulting to UPI.");
                yield context.getBean("upiPayment", PaymentMethod.class);
            }
        };


        double price = switch (productId) {
            case 1 -> 79999;
            case 2 -> 49999;
            case 3 -> 2999;
            default -> 0;
        };

        productService.buyProduct(productId, price, paymentMethod);
        System.out.println("✅ Order placed successfully!\n");
    }
}
