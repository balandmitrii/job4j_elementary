package ru.job4j.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class ConverterTest {

    @Test
    void whenConvert140rblThen2Euro() {
        double input = 140;
        double expected = 2;
        double output = Converter.rubleToEuro(input);
        double precision = 0.0001D;
        assertThat(output).isEqualTo(expected, withPrecision(precision));
    }

    @Test
    void whenConvert200RblThen3dot3333Euro() {
        double input = 200;
        double expected = 3.3333D;
        double output = Converter.rubleToDollar(input);
        double precission = 0.0001D;
        assertThat(output).isEqualTo(expected, withPrecision(precission));
    }
}