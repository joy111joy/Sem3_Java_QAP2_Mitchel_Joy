package Problem1;

// My Point for MyLine.java
public class MyPoint {
    //Instance Variables
    private int x;
    private int y;

    //Constructor
    public MyPoint( int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Getters and Stters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //Return point as an array of integers
    public int[] getXY() {
        return new int[]{x, y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Change to a string form
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}