package ru.job4j.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SquareTest {

    @Test
    @DisplayName("Сравнить массив {0, 1, 4} для 3 чисел")
    void whenCalculateArrayFor3Than0And1And4() {
        int[] expected = {0, 1, 4};
        int[] output = Square.calculate(3);
        assertThat(output).containsExactly(expected);
    }

    @Test
    @DisplayName("Сравнить массив {0} для 1 числа")
    void whenCalculateArrayFor1Than0() {
        int[] expected = {0};
        int[] output = Square.calculate(1);
        assertThat(output).containsExactly(expected);
    }

    @Test
    @DisplayName("Сравнить массив {0, 1, 4, 9} для 4 чисел")
    void whenCalculateArrayFor4Than0And1And4And9() {
        int[] expected = {0, 1, 4, 9};
        int[] output = Square.calculate(4);
        assertThat(output).containsExactly(expected);
    }

    @Test
    @DisplayName("Сравнить массив {0, 1, 4, 9, 16} для 5 чисел")
    void whenCalculateArrayFor5Than0And1And4And9And16() {
        int[] expected = {0, 1, 4, 9, 16};
        int[] output = Square.calculate(5);
        assertThat(output).containsExactly(expected);
    }
}