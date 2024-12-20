package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TemperatureFitTest {

    @Test
    void idealTemperatureForFruits() {
        int input = 10;
        double expected = 8.0D;
        double output = TemperatureFit.idealTemperatureForFruits(input);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void idealTemperatureForMeat() {
        int input = 10;
        double expected = 5.0D;
        double output = TemperatureFit.idealTemperatureForMeat(input);
        assertThat(output).isEqualTo(expected);
    }
}