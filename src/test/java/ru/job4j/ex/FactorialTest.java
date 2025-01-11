package ru.job4j.ex;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialTest {

    @Test
    void whenExeption() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Factorial().calc(-2);
                });
        assertThat(exception.getMessage()).isEqualTo(
                "Number could not be less than 0"
        );
    }

    @Test
    @DisplayName("Успешный поиск факториала для 6")
    void when6than120() throws RuntimeException {
        int input = 6;
        int expected = 120;
        int result = new Factorial().calc(input);
        assertThat(result).isEqualTo(expected);
    }
}