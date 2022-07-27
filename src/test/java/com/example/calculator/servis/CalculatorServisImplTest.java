package com.example.calculator.servis;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServisImplTest {

    CalculatorServisImpl out = new CalculatorServisImpl();

    @Test
    void shouldAdditionFirstArgumentIsNull() {
        String result = out.addition(null,"2");
        assertEquals(result, "Отсутствует параметр 1");
    }

    @Test
    void shouldAdditionSecondArgumentIsNull() {
        String result = out.addition("2", null);
        assertEquals(result, "Отсутствует параметр 2");
    }

    @Test
    void shouldSubtractionAllArgumentIsNull() {
        String result = out.subtraction(null, null);
        assertEquals(result, "Отсутствуют необходимые параметры");
    }

    @Test
    void shouldSubtractionFirstArgumentIsNotInt() {
        String result = out.subtraction("abc", "3");
        assertEquals(result, "Параметр 1 не является целым числом");
    }

    @Test
    void shouldMultiplySecondArgumentIsNotInt() {
        String result = out.multiply("3", "abc");
        assertEquals(result, "Параметр 2 не является целым числом");
    }

    @Test
    void shouldMultiplyAllArgumentIsNotInt() {
        String result = out.multiply("def", "abc");
        assertEquals(result, "Параметры не являются целыми числами");
    }

    @Test
    void shouldDivideCorrectCalculations() {
        String result = out.divide("22", "11");
        assertEquals(result, "22 / 11 = 2.0");
    }

    @Test
    void shouldDivideCorrectCalculations2() {
        String result = out.divide("30", "5");
        assertEquals(result, "30 / 5 = 6.0");
    }

    @Test
     void shouldDivideTo0() throws IllegalArgumentException {
        try {
            String result = out.divide("17", "0");
            Assertions.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException thrown) {
            Assertions.assertEquals("На ноль делить нельзя", thrown.getMessage());
        }
    }
}