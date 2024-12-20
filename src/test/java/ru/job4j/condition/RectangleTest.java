package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RectangleTest {

    @Test
    void whenLength12AndWidth10Then15dot62() {
        double inputLength = 12, inputWidth = 10;
        double expected = 15.62;
        double output = Rectangle.diagonal(inputLength, inputWidth);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength7AndWidth7Then9dot89() {
        double inputLength = 7, inputWidth = 7;
        double expected = 9.89;
        double output = Rectangle.diagonal(inputLength, inputWidth);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength12AndWidth10Then102dot83() {
        double inputLength = 24, inputWidth = 100;
        double expected = 102.83;
        double output = Rectangle.diagonal(inputLength, inputWidth);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}