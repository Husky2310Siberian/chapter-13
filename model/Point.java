package gr.aueb.cf.ch13.model;

public class Point {
    private  int x;
    private  int y;

    public Point() {
    }

    /**
     * Constructs a new point with specific
     * (x,y) coordinates
     * @param x     the x coordinate
     * @param y     the y coordinate
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gets the x- coordinate
     * @return x
     *          the x - coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Gets the y - coordinate
     * @param x
     *          the x - coordinate
     */
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**
     * Returns the state of this point
     * @return
     *          the x , y coordinates transformed into String (x,y)
     */
    public String pointToString() {
        return ("  point x = " + x + " and point y = " + y);
    }
}
