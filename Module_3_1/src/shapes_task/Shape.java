package shapes_task;

public class Shape {
    private double area;
    private String color;

    public Shape (String color){
        this.color = color;
    }
    public double calculateArea() {
        return area;
    }
    public String getColor() {
        return color;
    }
    @Override
    public String toString() {
        return "Shape of color: " + color;
    }
}
