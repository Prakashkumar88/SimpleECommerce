package org.example.calculator.service;

import org.springframework.stereotype.Component;

@Component
public class AdditionService implements Operation{
    @Override
    public double operate(double a, double b) {
        return a + b;
    }
}
