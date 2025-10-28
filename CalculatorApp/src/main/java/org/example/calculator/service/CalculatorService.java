package org.example.calculator.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculatorService {
    private final AdditionService additionService;
    private final SubtractionService subtractionService;

    @Autowired
    CalculatorService(AdditionService additionService, SubtractionService subtractionService){
        this.additionService = additionService;
        this.subtractionService = subtractionService;
    }

    public double add(double a, double b){
        return additionService.operate(a, b);
    }

    public double subtract(double a, double b){
        return subtractionService.operate(a, b);
    }
}
