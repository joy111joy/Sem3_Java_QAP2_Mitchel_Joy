package Problem2;

public class TestMyRectangle {
    public static void main(String[] args) {
        //Create 2 points
        MyPoint topleft = new MyPoint(2, 3);
        MyPoint bottomright = new MyPoint(5, 7);

        //Create new reactangle instance
        MyRectangle rectangle1 = new MyRectangle(topleft, bottomright);

        //Test Getters
        System.out.println("Rectangle topleft: " + rectangle1.getTopLeft());
        System.out.println("Rectangle bottomright: " + rectangle1.getBottomRight());

        //test setters by creating new points on rectancle
        rectangle1.setTopLeft(new MyPoint(3, 4));
        rectangle1.setBottomRight(new MyPoint(6, 8));
        
        //Test Getters again 
        System.out.println("New Rectangle topleft: " + rectangle1.getTopLeft());
        System.out.println("New Rectangle bottomright: " + rectangle1.getBottomRight());

        //area width height perimeter
        System.out.println("Area of rectangle 1: " + rectangle1.getArea());
        System.out.println("Width of rectangle 1: " + rectangle1.getWidth());
        System.out.println("Height of rectangle 1: " + rectangle1.getHeight());
        System.out.println("Perimeter of rectangle 1: " + rectangle1.getPerimeter());

        //Change to String
        System.out.println(rectangle1);
    }

}
