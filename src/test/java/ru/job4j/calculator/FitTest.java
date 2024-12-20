package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class FitTest {

    @Test
    void whenMan175Than86dot25() {
        short height = 175;
        double expected = 86.25D;
        double output = Fit.manWeight(height);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman165Than63dot25() {
        short height = 165;
        double expected = 63.25D;
        double output = Fit.womanWeight(height);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}