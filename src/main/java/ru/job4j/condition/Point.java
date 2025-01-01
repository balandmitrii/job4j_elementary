package ru.job4j.condition;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance3d(Point that) {
        return sqrt(
                pow(this.x - that.x, 2)
                        + pow(this.y - that.y, 2)
                        + pow(this.z - that.z, 2)
        );
    }

    public double distance(Point otherPoint) {
        return sqrt(
                pow(this.x - otherPoint.x, 2) + pow(this.y - otherPoint.y, 2)
        );
    }

    public static void main(String[] args) {
        Point point1 = new Point(2, 4);
        Point point2 = new Point(4, 8);
        double resultDistance = point1.distance(point2);
        System.out.println("result distance: " + resultDistance);
    }
}
