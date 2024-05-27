package Problem2;

public class MyPoint {
    //instance variables
    private int x;
    private int y;

    //Constructor
    public MyPoint( int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Getters and Setters
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

    public int[] getXY() {
        return new int[]{x, y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Change to String
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}