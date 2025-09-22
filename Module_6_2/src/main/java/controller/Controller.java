package controller;

import model.Converter;
import view.ConverterView;

public class Controller {
    Converter converter = new Converter();
    private ConverterView view;
    public Controller(ConverterView view) {
        this.view = view;
    }
    public double convert (double amount, String from, String to) {
        return converter.convert(amount, from, to);
    }

    public static void main(String[] args) {
        ConverterView.launch(ConverterView.class);
    }
}
