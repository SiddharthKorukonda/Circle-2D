/* Siddharth Korukonda
   115607752
   CSE 114
   Paul Fodor
   Homework 6
   Question 1 (Circle2D.java)
 */

public class Circle2D {
    private double x;
    private double y;
    private double radius;

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle2D() {
        this(0,0,1);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return (Math.pow(radius,2))*(Math.PI);
    }

    public double getPerimeter() {
        return 2*radius*(Math.PI);
    }

    public boolean contains(double x_contains, double y_contains) {
        double distance_from_center = Math.sqrt(Math.pow(x_contains-x,2)-Math.pow(y_contains-y,2));

        return distance_from_center <= radius;
    }

    public boolean contains(Circle2D circle) {
        double distance_between_centers = Math.sqrt(Math.pow(circle.getX()-x,2)+Math.pow(circle.getY()-y,2));

        return distance_between_centers + circle.getRadius() <= radius;
    }

    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2,2,5.5);

        System.out.println("Area: "+c1.getArea());
        System.out.println("Perimeter: "+c1.getPerimeter());
        System.out.println("Contains point (3,3): "+c1.contains(3,3));
        System.out.println("Contains circle centered at (4,5) with radius 10.5: "+c1.contains(new Circle2D(4,5,10.5)));
    }
}
