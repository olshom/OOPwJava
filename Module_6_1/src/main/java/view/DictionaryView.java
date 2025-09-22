package view;

import controller.DictionaryController;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.*;

public class DictionaryView extends Application{
    private DictionaryController controller;
    String definition;
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Dictionary");

        TextField wordField = new TextField();
        Button searchButton = new Button("Search Word");
        TextArea defText = new TextArea();

        searchButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                definition = controller.getDefinition(wordField.getText());
                defText.setText(definition);
            }
        });

        FlowPane root = new FlowPane();
        root.getChildren().addAll(searchButton, wordField, defText);
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void init() {
        controller = new DictionaryController(this);
    }

}
