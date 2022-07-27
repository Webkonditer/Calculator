package com.example.calculator.servis;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServisImplParametrTest {

    public static Stream<Arguments> ProvideParamsAddition(){
        return Stream.of(
                Arguments.of("2","3","2 + 3 = 5"),
                Arguments.of(null,"3","Отсутствует параметр 1")
        );
    }
    @ParameterizedTest
    @MethodSource("ProvideParamsAddition")
    void shouldAdditionCorrect(String num1, String num2, String expectedResult) {
        CalculatorServisImpl out = new CalculatorServisImpl();
        String result = out.addition(num1,num2);
        assertEquals(result, expectedResult);
    }

    public static Stream<Arguments> ProvideParamsSubtraction(){
        return Stream.of(
                Arguments.of("10","7","10 - 7 = 3"),
                Arguments.of("3",null,"Отсутствует параметр 2")
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideParamsSubtraction")
    void shouldSubtractionCorrect(String num1, String num2, String expectedResult) {
        CalculatorServisImpl out = new CalculatorServisImpl();
        String result = out.subtraction(num1,num2);
        assertEquals(result, expectedResult);
    }

    public static Stream<Arguments> ProvideParamsMultiply(){
        return Stream.of(
                Arguments.of("10","7","10 * 7 = 70"),
                Arguments.of(null,null,"Отсутствуют необходимые параметры")
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideParamsMultiply")
    void shouldMultiplyCorrect(String num1, String num2, String expectedResult) {
        CalculatorServisImpl out = new CalculatorServisImpl();
        String result = out.multiply(num1,num2);
        assertEquals(result, expectedResult);
    }

    public static Stream<Arguments> ProvideParamsDivide(){
        return Stream.of(
                Arguments.of("55","11","55 / 11 = 5.0"),
                Arguments.of("abc","def","Параметры не являются целыми числами")
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideParamsDivide")
    void shouldDivideCorrect(String num1, String num2, String expectedResult) {
        CalculatorServisImpl out = new CalculatorServisImpl();
        String result = out.divide(num1,num2);
        assertEquals(result, expectedResult);
    }
}