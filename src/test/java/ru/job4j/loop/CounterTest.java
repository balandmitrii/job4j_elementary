package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenSumStart5AndFinish20Than189() {
        int start = 2;
        int finish = 20;
        int expected = 189;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumStart20AndFinish10Than0() {
        int start = 20;
        int finish = 10;
        int expected = 0;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumStartMinus12AndFinishMinus4ThanMinus68() {
        int start = -12;
        int finish = -4;
        int expected = -68;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }
}