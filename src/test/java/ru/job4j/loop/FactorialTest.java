package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FactorialTest {

    @Test
    void whenCalculateFactorialFor5Then120() {
        int input = 5;
        int expected = 120;
        int output = Factorial.factorial(input);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialFor10Then3628800() {
        int input = 10;
        int expected = 3628800;
        int output = Factorial.factorial(input);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialFor1Then1() {
        int input = 1;
        int expected = 1;
        int output = Factorial.factorial(input);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialFor0Then1() {
        int input = 0;
        int expected = 1;
        int output = Factorial.factorial(input);
        assertThat(output).isEqualTo(expected);
    }
}