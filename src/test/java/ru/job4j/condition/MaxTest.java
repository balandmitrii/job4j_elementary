package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void when3and5than5() {
        int a = 3;
        int b = 5;
        int expected = 5;
        Max max = new Max();
        int output = max.max(3, 5);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when3and5and7than7() {
        int a = 3;
        int b = 5;
        int c = 7;
        int expected = 7;
        Max max = new Max();
        int output = max.max(3, 5, 7);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when8and1and12andminus5than12() {
        int a = 8;
        int b = 1;
        int c = 12;
        int d = -5;
        int expected = 12;
        Max max = new Max();
        int output = max.max(8, 1, 12, -5);
        assertThat(output).isEqualTo(expected);
    }
}