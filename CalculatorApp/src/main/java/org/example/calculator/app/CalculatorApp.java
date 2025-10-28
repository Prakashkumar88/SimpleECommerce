package org.example.calculator.app;

import org.example.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class CalculatorApp {
    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorApp(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }

    public void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("**** Simple Spring Calculator ****");

        System.out.println("Enter first number");
        double a = scanner.nextDouble();

        System.out.println("Enter Second number");
        double b = scanner.nextDouble();

        System.out.println("\nSelect the Operations");
        System.out.println("1) Addition");
        System.out.println("2) Subtraction");
        System.out.print("Choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> System.out.println("Result : " + calculatorService.add(a, b));
            case 2 -> System.out.println("Result : " + calculatorService.subtract(a, b));
            default -> System.out.println("Invalid choice!");
        }

        scanner.close();
    }

}
