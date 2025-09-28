package view;


import javafx.application.Application;
import controller.PetController;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import model.Pet;


public class View extends Application {
    @Override
    public void start(Stage stage) {
        Pet pet = new Pet(100, 100);
        PetView view = new PetView();
        PetController controller = new PetController(pet, view);

        StackPane root = new StackPane(controller.getView());
        Scene scene = new Scene(root);

        stage.setTitle("Virtual Pet Walker");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

