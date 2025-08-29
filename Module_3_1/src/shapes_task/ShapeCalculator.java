package shapes_task;

import java.util.ArrayList;

public class ShapeCalculator {
    public static void main (String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5.0, "red"));
        shapes.add(new Rectangle(12, 5, "blue"));
        shapes.add(new Triangle(9, 6, "green"));

        for (Shape shape : shapes) {
            System.out.println(shape);;
        }
    }
}
