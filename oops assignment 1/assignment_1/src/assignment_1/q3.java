package assignment_1;
 class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Point p1 = new Point(1.0, 2.0);

        System.out.println("Initial X: " + p1.getX());
        System.out.println("Initial Y: " + p1.getY());

        Point p2 = new Point(p1);

        System.out.println("Initial X (copied): " + p2.getX());
        System.out.println("Initial Y (copied): " + p2.getY());

        p1.setX(3.0);
        p1.setY(4.0);

        System.out.println("Updated X: " + p1.getX());
        System.out.println("Updated Y: " + p1.getY());

        System.out.println("Updated X (copied): " + p2.getX());
        System.out.println("Updated Y (copied): " + p2.getY());
    }
}

	}


