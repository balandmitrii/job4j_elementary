package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenPoints5And81And11And18Then7() {
        Point point1 = new Point(5, 11);
        Point point2 = new Point(8, 18);
        double expected = 7.61;
        double output = point1.distance(point2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus4AndMinus7And12And13Then3dot16() {
        Point point1 = new Point(-4, 12);
        Point point2 = new Point(-7, 13);
        double expected = 3.16;
        double output = point1.distance(point2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoints11And1AndMinus4And3Then12dot20() {
        Point point1 = new Point(11, -4);
        Point point2 = new Point(1, 3);
        double expected = 12.20;
        double output = point1.distance(point2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}