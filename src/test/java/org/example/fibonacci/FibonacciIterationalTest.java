package org.example.fibonacci;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class FibonacciIterationalTest {

    final private Fibonacci fibonacci = new FibonacciIterational();

    @Test
    public void shouldReturn8WhenNIs6() {
        //given
        final int n = 6;
        final BigDecimal expectedResult = new BigDecimal(8);

        //when
        BigDecimal result = fibonacci.findN(n);

        //then
        assertEquals(expectedResult, result);
    }

    @Test
    public void shouldReturn0WhenNIs0() {
        //given
        final int n = 0;
        final BigDecimal expectedResult = new BigDecimal(0);

        //when
        BigDecimal result = fibonacci.findN(n);

        //then
        assertEquals(expectedResult, result);
    }

    @Test
    public void shouldReturn1WhenNIs1() {
        //given
        final int n = 1;
        final BigDecimal expectedResult = new BigDecimal(1);

        //when
        BigDecimal result = fibonacci.findN(n);

        //then
        assertEquals(expectedResult, result);
    }
}