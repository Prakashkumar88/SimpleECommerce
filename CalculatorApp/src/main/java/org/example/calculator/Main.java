package org.example.calculator;

import org.example.calculator.app.CalculatorApp;
import org.example.calculator.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CalculatorApp calculatorApp = context.getBean(CalculatorApp.class);

        calculatorApp.start();
    }
}
