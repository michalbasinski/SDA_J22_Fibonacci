package org.example.fibonacci;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciFactoryTest {

    final private FibonacciFactory factory = FibonacciFactory.getInstance();

    @Test
    public void shouldReturnFibonacciRecursive() {
        //given
        final FibonacciType type = FibonacciType.RECURSIVE;

        //when
        Fibonacci result = factory.produce(type);

        //then
        assertTrue(result instanceof Fibonacci);
        assertTrue(result instanceof FibonacciRecursive);
        assertFalse(result instanceof FibonacciIterational);
    }

    @Test
    public void shouldReturnFibonacciIterational() {
        //given
        final FibonacciType type = FibonacciType.ITERATIONAL;

        //when
        Fibonacci result = factory.produce(type);

        //then
        assertTrue(result instanceof Fibonacci);
        assertTrue(result instanceof FibonacciIterational);
        assertFalse(result instanceof FibonacciRecursive);
    }
}