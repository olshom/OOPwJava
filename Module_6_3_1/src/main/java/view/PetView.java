package view;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class PetView extends Canvas {
    private final Image petImage;

    public PetView() {
        super(600, 400); // canvas size
        this.petImage = new Image(getClass().getResourceAsStream("/images/pet.png"));
    }

    public void draw(double x, double y) {
        GraphicsContext gc = getGraphicsContext2D();
        gc.clearRect(0, 0, getWidth(), getHeight());
        gc.drawImage(petImage, x, y, 50, 50);
    }
}

