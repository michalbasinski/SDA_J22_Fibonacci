package org.example.fibonacci;

import java.math.BigDecimal;

class FibonacciIterational implements Fibonacci {

    @Override
    public BigDecimal findN(int n) {
        if (n == 0 || n == 1) {
            return new BigDecimal(n);
        } else {
            BigDecimal prev = new BigDecimal(0);
            BigDecimal current = new BigDecimal(1);

            for (int i = 2; i <= n; i++) {
                BigDecimal temp = current;
                current = current.add(prev);
                prev = temp;
            }
            return current;
        }
    }
}
