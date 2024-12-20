package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class VectorTest {

    @Test
    void whenVectors12And34ThenResult11AndMinus3() {
        int x1 = 4, x2 = 7, y1 = 2, y2 = -5;
        String expected = "(11, -3)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenVectors12And34ThenResult7AndMinus11() {
        int x1 = 2, x2 = 5, y1 = -3, y2 = -8;
        String expected = "(7, -11)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenVectors12And34ThenResultMinus18And47() {
        int x1 = -6, x2 = -12, y1 = 33, y2 = 14;
        String expected = "(-18, 47)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }
}