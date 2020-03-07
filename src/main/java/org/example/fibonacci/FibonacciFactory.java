package org.example.fibonacci;

public class FibonacciFactory {
    private static FibonacciFactory instance = new FibonacciFactory();

    private FibonacciFactory() {}

    public static FibonacciFactory getInstance() {
        return instance;
    }

    public Fibonacci produce(FibonacciType variant) {
        if (FibonacciType.RECURSIVE.equals(variant)) {
            return new FibonacciRecursive();
        }
        if (FibonacciType.ITERATIONAL.equals(variant)) {
            return new FibonacciIterational();
        }
        return null;
    }

}
