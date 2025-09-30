package view;
import controller.Controller;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.List;

public class ConverterView extends Application{
    public Controller controller = new Controller(this);
    String selectedFrom;
    String selectedTo;

    public void showDatabaseError(String message) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Database Error");
            alert.setHeaderText("Database Connection Failed");
            alert.setContentText(message);
            alert.showAndWait();
    }
    @Override
    public void start(Stage window) throws Exception {
        VBox layout = new VBox();
        List<String> currencies = controller.getAllCurrencyAbbreviations();

        FlowPane inputLayout = new FlowPane();
        TextField amount = new TextField("Amount");
        inputLayout.getChildren().add(amount);

        ComboBox<String> group = new ComboBox<>();
        group.getItems().addAll(currencies);
        group.setValue(currencies.get(0));
        selectedFrom = currencies.get(0);
        group.setOnAction(actionEvent -> {
            selectedFrom = group.getValue();
        });

        inputLayout.getChildren().add(group);
        layout.getChildren().add(inputLayout);


        FlowPane resultLayout = new FlowPane();

        TextField result = new TextField();
        resultLayout.getChildren().add(result);

        ComboBox<String> groupResult = new ComboBox<>();
        groupResult.getItems().addAll(currencies);
        groupResult.setValue(currencies.get(0));
        selectedTo = currencies.get(0);
        groupResult.setOnAction(actionEvent -> {
            selectedTo = groupResult.getValue();
        });

        resultLayout.getChildren().add(groupResult);
        Button convertButton = new Button("Convert");
        resultLayout.getChildren().add(convertButton);
        layout.getChildren().add(resultLayout);

        convertButton.setOnAction((event) -> {
            try {
                double amountInput = Double.parseDouble(amount.getText());
                double resultConverter = controller.convert(amountInput, selectedFrom, selectedTo);
                result.setText(String.valueOf(resultConverter));
            } catch (NumberFormatException e) {
                result.setText("Invalid input");
            }
        });
        Scene view = new Scene(layout);
        window.setTitle("Currency Converter");
        window.setScene(view);
        window.show();

    }
}
