package Problem2;

public class MyRectangle {
    //Instance Variables for the coordiants of the rectangles points
    private MyPoint topLeft;
    private MyPoint bottomRight;

    //Constructors
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    //Getters and Setters
    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    public int getTopLeftX() {
        return topLeft.getX();
    }

    public void setTopLeftX(int x) {
        topLeft.setX(x);
    }

    public int getTopLeftY() {
        return topLeft.getY();
    }

    public void setTopLeftY(int y) {
        topLeft.setY(y);
    }

    public int getBottomRightX() {
        return bottomRight.getX();
    }

    public void setBottomRightX(int x) {
        bottomRight.setX(x);
    }

    public int getBottomRightY() {
        return bottomRight.getY();
    }

    public void setBottomRightY(int y) {
        bottomRight.setY(y);
    }

    //Other methods (Width, Height, Area, Perimeter)
    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    public int getHeight() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }


    public double getArea() {
        return getWidth() * getHeight();
    }

    public double getPerimeter() {
        return 2*(getWidth()) + 2*(getHeight());
    }

    //Change to String
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + 
               ", width=" + getWidth() + ", height=" + getHeight() + 
               ", area=" + getArea() + ", perimeter=" + getPerimeter() + "]";    
            }


}
