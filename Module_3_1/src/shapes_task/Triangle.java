package shapes_task;

public class Triangle extends Shape{
    private double height;
    private double base;

    public Triangle(double h, double a, String color) {
        super(color);
        this.height = h;
        this.base = a;
    }
    @Override
    public double calculateArea() {
        return (base *height)/2;
    }

    @Override
    public String toString() {
        return ("Area of Triangle with base " + base + " and height " + height + ": " + calculateArea() + ", color " + getColor());
    }
}

