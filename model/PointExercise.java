package gr.aueb.cf.ch13.model;

public class PointExercise {

    private double x1;
    private double x2;
    private double y1;
    private double y2;
    private double z1;
    private double z2;

    public PointExercise() {
    }

    public PointExercise(double x1, double x2, double y1, double y2, double z1, double z2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.z1 = z1;
        this.z2 = z2;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double getZ1() {
        return z1;
    }

    public void setZ1(double z1) {
        this.z1 = z1;
    }

    public double getZ2() {
        return z2;
    }

    public void setZ2(double z2) {
        this.z2 = z2;
    }

        public double getXYDistance (){
        return (Math.sqrt((Math.pow((getX1() - getY1() - getZ1()) , 2) +
                (Math.pow((getX2() - getY2() - getZ2()) , 2)))));
    }

    public double getYZDistance (){
        System.out.println("the distance yz is : ");
        return Math.sqrt((y1 - z1) + (y2 - z2));
    }

    public double getXZDistance (){
        System.out.println("the distance xz is : ");
        return Math.sqrt((x1 - z1) + (x2 - z2));
    }

        public double getXYZDistance (){
        return (Math.sqrt((Math.pow((getX1() - getY1() - getZ1()) , 2) +
                (Math.pow((getX2() - getY2() - getZ2()) , 2)))));
    }

    public String convertToString() {
        return ("point x  = " + x1 + " , " + x2 + " point y = " + y1+ " , " + y2 + " and point z = " + z1 + " , " + z2);
    }
}
