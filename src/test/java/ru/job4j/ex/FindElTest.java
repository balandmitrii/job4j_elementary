package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FindElTest {

    @Test
    void whenException() {
        String[] array = {"one", "two", "three"};
        String key = "five";
        ElementNotFoundException exception = assertThrows(
                ElementNotFoundException.class,
                () -> {
                    FindEl.indexOf(array, key);
                });
        assertThat(exception.getMessage()).isEqualTo(
                "Элемент в массиве не найден"
        );
    }

    @Test
    void whenFoundIndexSuccessfully() throws ElementNotFoundException {
        String[] array = {"one", "two", "three", "four"};
        String key = "three";
        int expected = 2;
        int result = FindEl.indexOf(array, key);
        assertThat(result).isEqualTo(expected);
    }
}