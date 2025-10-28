package org.example.repository;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
    public String getProductById(int id) {
        return switch (id) {
            case 1 -> "Laptop";
            case 2 -> "Smartphone";
            case 3 -> "Headphones";
            default -> "Unknown Product";
        };
    }
}
