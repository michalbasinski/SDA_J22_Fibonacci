package org.example.fibonacci;

import java.math.BigDecimal;

class FibonacciRecursive implements Fibonacci {

    @Override
    public BigDecimal findN(int n) {
        if (n == 0 || n == 1) {
            return new BigDecimal(n);
        } else {
            return findN(n - 1).add(findN(n - 2));
        }
    }

}
