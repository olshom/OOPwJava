package shapes_task;

public class Circle extends Shape{
    private double radius;
    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return ("Area of Circle with radius " +radius + ": " + calculateArea() + ", color " + getColor());
    }
}
