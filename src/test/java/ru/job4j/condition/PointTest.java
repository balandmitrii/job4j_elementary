package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenPoints5And81And11And18Then7() {
        int inputX1 = 5, inputX2 = 8, inputY1 = 11, inputY2 = 18;
        double expected = 7.61;
        double output = Point.distance(inputX1, inputY1, inputX2, inputY2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus4AndMinus7And12And13Then3dot16() {
        int inputX1 = -4, inputX2 = -7, inputY1 = 12, inputY2 = 13;
        double expected = 3.16;
        double output = Point.distance(inputX1, inputY1, inputX2, inputY2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoints11And1AndMinus4And3Then12dot20() {
        int inputX1 = 11, inputX2 = 1, inputY1 = -4, inputY2 = 3;
        double expected = 12.20;
        double output = Point.distance(inputX1, inputY1, inputX2, inputY2);
        System.out.println(output);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}