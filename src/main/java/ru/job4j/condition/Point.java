package ru.job4j.condition;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point otherPoint) {
        return Math.sqrt(
                Math.pow(this.x - otherPoint.x, 2) + Math.pow(this.y - otherPoint.y, 2)
        );
    }

    public static void main(String[] args) {
        Point point1 = new Point(2, 4);
        Point point2 = new Point(4, 8);
        double resultDistance = point1.distance(point2);
        System.out.println("result distance: " + resultDistance);
    }
}
