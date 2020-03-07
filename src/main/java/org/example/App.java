package org.example;

import org.example.fibonacci.Fibonacci;
import org.example.fibonacci.FibonacciFactory;
import org.example.fibonacci.FibonacciType;

import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {
        int n = 100000;
        FibonacciType variant = FibonacciType.ITERATIONAL;

        FibonacciFactory factory = FibonacciFactory.getInstance();
        Fibonacci fibonacci = factory.produce(variant);

        BigDecimal result = fibonacci.findN(n);

        System.out.println("Wyraz nr " + n + " ciągu Fibonacciego to " + result);

    }
}
