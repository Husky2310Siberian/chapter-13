package gr.aueb.cf.ch13;

import gr.aueb.cf.ch13.model.PointExercise;

public class MainPointExercise {

    public static void main(String[] args) {

        PointExercise p = new PointExercise(3.0,5.0,6.0,10.0,1.0,7.0);

        System.out.println("the point elements are " + p.convertToString());

        System.out.println();
        System.out.println("the distance xyz = " +p.getXYZDistance());
        System.out.println("the distance xy = " +p.getXYDistance());

    }
}
