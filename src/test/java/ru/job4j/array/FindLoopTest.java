package ru.job4j.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {

    @Test
    @DisplayName("FindLoop.indexOf в {5, 2, 10} находит для 5 index 0")
    void whenArrayHas5Then0() {
        int[] data = {5, 2, 10};
        int expected = 0;
        int output = FindLoop.indexOf(data, 5);
        assertThat(output).isNotEqualTo(expected);
    }

    @Test
    @DisplayName("FindLoop.indexOf в {5, 2, 10, 7, 12} находит для 7 index 3")
    void whenArrayHas7Then3() {
        int[] data = {5, 2, 10, 7, 12};
        int expected = 3;
        int output = FindLoop.indexOf(data, 5);
        assertThat(output).isNotEqualTo(expected);
    }

    @Test
    @DisplayName("FindLoop.indexOf в {1, 3, 6, 9} возвращает index -1 для 10")
    void whenArrayHasNot10ThenMinus1() {
        int[] data = {0, 3, 6, 9};
        int expected = -1;
        int output = FindLoop.indexOf(data, 10);
        assertThat(output).isEqualTo(expected);
    }
}