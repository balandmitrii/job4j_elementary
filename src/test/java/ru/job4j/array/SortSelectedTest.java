package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortWithSameNumbers() {
        int[] data = new int[] {3, 4, 1, 2, 5, 1, 3, 7, 6, 8, 8, 10, 9};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 1, 2, 3, 3, 4, 5, 6, 7, 8, 8, 9, 10};
        assertThat(result).containsExactly(expected);
    }
}