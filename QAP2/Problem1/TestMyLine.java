package Problem1;

public class TestMyLine {
    public static void main(String[] args) {
        // Create 2 point instances
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);

        // Create line instance
        MyLine line = new MyLine(p1, p2);

        // Test Getters
        System.out.println("Begin: " + line.getBegin());
        System.out.println("End: " + line.getEnd());

        // Test Setters by creatiing new points
        line.setBegin(new MyPoint(2, 3));
        line.setEnd(new MyPoint(5, 7));

        // Test Getters on new points
        System.out.println("New Begin: " + line.getBegin());
        System.out.println("New End: " + line.getEnd());

        // Test Getters on specific values in new points
        System.out.println("Begin X: " + line.getBeginX());
        System.out.println("Begin Y: " + line.getBeginY());
        System.out.println("End X: " + line.getEndX());
        System.out.println("End Y: " + line.getEndY());

        // Test Setters on specific values
        line.setBeginX(3);
        line.setBeginY(4);
        line.setEndX(6);
        line.setEndY(8);

        // Test Methods (Length and Gradient)
        System.out.println("Length of Line:" + line.getLength());
        System.out.println("Gradient of Line in Radians: " + line.getGradient());

    }
}