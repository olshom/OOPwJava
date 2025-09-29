package view;
import controller.Controller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class ConverterView extends Application{
    public Controller controller = new Controller(this);
    String selectedFrom = "EUR";
    String selectedTo = "USD";
    @Override
    public void start(Stage window) throws Exception {
        VBox layout = new VBox();

        FlowPane inputLayout = new FlowPane();
        TextField amount = new TextField("Amount");
        inputLayout.getChildren().add(amount);

        ComboBox<String> group = new ComboBox<>();
        group.getItems().addAll("EUR", "USD", "BGN", "GBP");
        group.setValue("EUR");
        group.setOnAction(actionEvent -> {
            selectedFrom = group.getValue();
        });

        inputLayout.getChildren().add(group);
        layout.getChildren().add(inputLayout);


        FlowPane resultLayout = new FlowPane();

        TextField result = new TextField();
        resultLayout.getChildren().add(result);

        ComboBox<String> groupResult = new ComboBox<>();
        groupResult.getItems().addAll("EUR", "USD", "BGN", "GBP");
        groupResult.setValue("USD");
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
