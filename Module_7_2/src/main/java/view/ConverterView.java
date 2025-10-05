package view;
import application.ConverterApp;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.List;

public class ConverterView extends Application{
    public ConverterApp controller = new ConverterApp(this);
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
        Button insertNewCurrency = new Button("Insert new currency");
        insertNewCurrency.setOnAction((event) -> {
            Stage newCurrencyView = new Stage();
            VBox newCurrencyLayout = new VBox();
            TextField abbreviation = new TextField("Abbreviation");
            TextField name = new TextField("Name");
            TextField rate = new TextField("Exchange rate to EUR");
            Button saveButton = new Button("Save");
            newCurrencyLayout.getChildren().addAll(abbreviation, name, rate, saveButton);
            Scene newCurrencyScene = new Scene(newCurrencyLayout);
            newCurrencyView.setTitle("Insert New Currency");
            newCurrencyView.setScene(newCurrencyScene);
            saveButton.setOnAction((e) -> {
                String abbr = abbreviation.getText();
                String nm = name.getText();
                double rt;
                try {
                    rt = Double.parseDouble(rate.getText());
                } catch (NumberFormatException ex) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Input Error");
                    alert.setHeaderText("Invalid Exchange Rate");
                    alert.setContentText("Please enter a valid number for the exchange rate.");
                    alert.showAndWait();
                    return;
                }
                try {
                    controller.insertCur(abbr, nm, rt);
                    List<String> updatedCurrencies = controller.getAllCurrencyAbbreviations();
                    group.getItems().clear();
                    group.getItems().addAll(updatedCurrencies);
                    group.setValue(updatedCurrencies.get(0));
                    selectedFrom = updatedCurrencies.get(0);
                    groupResult.getItems().clear();
                    groupResult.getItems().addAll(updatedCurrencies);
                    groupResult.setValue(updatedCurrencies.get(0));
                    selectedTo = updatedCurrencies.get(0);
                    newCurrencyView.close();
                } catch (Exception ex) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Database Error");
                    alert.setHeaderText("Failed to Add Currency");
                    alert.setContentText(ex.getMessage());
                    alert.showAndWait();
                }
            });
            newCurrencyView.show();
        });
        layout.getChildren().add(insertNewCurrency);
        Scene view = new Scene(layout);
        window.setTitle("Currency Converter");
        window.setScene(view);
        window.show();

    }
}
