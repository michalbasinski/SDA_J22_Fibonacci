package org.example.fibonacci;

public class FibonacciFactory {

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
