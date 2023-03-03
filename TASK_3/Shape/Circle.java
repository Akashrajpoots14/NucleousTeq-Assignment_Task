package TASK_3.Shape;

public class Circle extends Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        System.out.println("Area of Circle : " + 3.44 * radius * radius);
    }

    @Override
    void parameter() {
        System.out.println("Perimeter of Circle : " + 2 * 3.44 * radius);
    }
}
