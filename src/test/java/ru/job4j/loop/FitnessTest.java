package ru.job4j.loop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FitnessTest {
    @Test
    @DisplayName("Проверить, когда Иван тянет больше")
    void whenIvanGreatNik() {
        int ivan = 95;
        int nik = 90;
        int result = Fitness.calc(ivan, nik);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("Проверить, когда Иван тянет меньше")
    void whenIvanLessByOneNik() {
        int ivan = 90;
        int nik = 95;
        int result = Fitness.calc(ivan, nik);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("Проверить, когда Иван тянет меньше")
    void whenIvanLessByFewNik() {
        int ivan = 50;
        int nik = 90;
        int result = Fitness.calc(ivan, nik);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("Проверить, когда Иван тянет столько же, сколько и Николай")
    void whenIvanEqualsNik() {
        int ivan = 90;
        int nik = 90;
        int result = Fitness.calc(ivan, nik);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
}
