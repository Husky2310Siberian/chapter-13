package gr.aueb.cf.ch13;

import gr.aueb.cf.ch13.model.Point;

public class MainPoint {

    public static void main(String[] args) {

        Point p1 = new Point(3,5);
        Point p2 = new Point(8,-4);
        Point p3 = new Point();

        p3.setX(12);
        p3.setY(-22);


        System.out.println("p1 x = " + p1.getX());
        System.out.println("p1 y = " + p1.getY());
        System.out.println("p2 x = " + p2.getX());
        System.out.println("p2 y = " + p2.getY());
        System.out.println("p3 x = " + p3.getX());
        System.out.println("p3 y = " + p3.getY());


        System.out.println(p1.pointToString());
    }
}
