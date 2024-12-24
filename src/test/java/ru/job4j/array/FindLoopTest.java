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
    
    @Test
    public void whenDiapasonHas8ThenResultEqualFinish() {
        int[] data = new int[] {5, 2, 10, 2, 4, 8, 14, 3, 21, 16};
        int element = 8;
        int start = 2;
        int finish = 5;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasSomeEqualElementThen3() {
        int[] data = new int[] {5, 10, 2, 4, 8, 4, 14, 4, 3, 21, 16};
        int element = 4;
        int start = 1;
        int finish = 8;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int element = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasNot8ThenMinus1() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int element = 8;
        int start = 1;
        int finish = 3;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}