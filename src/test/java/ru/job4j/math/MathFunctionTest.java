package ru.job4j.math;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MathFunctionTest {

    @Test
    void whenSum10and20Then30() {
        double inputA = 10;
        double inputB = 20;
        double expected = 30;
        double output = MathFunction.sum(inputA, inputB);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenMinus99from100Than1() {
        double inputA = 100;
        double inputB = 99;
        double expected = 1;
        double output = MathFunction.minus(inputA, inputB);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenMultiply7to5Than35() {
        double inputA = 7;
        double inputB = 5;
        double expected = 35;
        double output = MathFunction.multiply(inputA, inputB);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenDivide20to5Then4() {
        double inputA = 20;
        double inputB = 5;
        double expected = 4;
        double output = MathFunction.divide(inputA, inputB);
        assertThat(output).isEqualTo(expected);
    }
}