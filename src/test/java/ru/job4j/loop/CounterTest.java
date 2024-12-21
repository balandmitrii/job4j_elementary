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

    @Test
    void whenSumByEvenStart1AndFinish5Than6() {
        int start = 1;
        int finish = 5;
        int expected = 6;
        int output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumByEvenStart0AndFinish25Than156() {
        int start = 0;
        int finish = 25;
        int expected = 156;
        int output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumByEvenStartMinus15AndFinish5ThanMinus50() {
        int start = -15;
        int finish = 5;
        int expected = -50;
        int output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }
}