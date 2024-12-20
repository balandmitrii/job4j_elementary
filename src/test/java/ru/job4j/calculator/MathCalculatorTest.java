package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MathCalculatorTest {

    @Test
    void sumMultiplyAndSum20and40Than860() {
        double inputA = 20;
        double inputB = 40;
        double expected = 860D;
        double output = MathCalculator.sumMultiplyAndSum(inputA, inputB);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void sumDivideAndMinus20and40ThanNegative19dot5() {
        double inputA = 20;
        double inputB = 40;
        double expected = -19.5D;
        double output = MathCalculator.sumDivideAndMinus(inputA, inputB);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void sumDivideAndMinusAndSumAndMultiply20and40Than840dot5() {
        double inputA = 20;
        double inputB = 40;
        double expected = 840.5D;
        double output = MathCalculator.sumDivideAndMinusAndSumAndMultiply(inputA, inputB);
        System.out.println("output: " + output);
        assertThat(output).isEqualTo(expected);
    }
}