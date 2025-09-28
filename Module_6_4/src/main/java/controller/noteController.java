package controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import model.Note;
import model.Notebook;
import view.NotebookView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class noteController {
    private Notebook notebook = new Notebook();
    @FXML
    private ListView notesList;

    @FXML
    private TextArea noteContent;
    @FXML
    private TextField noteTitle;
    @FXML
    private void onAddNote(ActionEvent event) {
        String title = noteTitle.getText();
        String content = noteContent.getText();
        Note note = new Note(title, content);
        notebook.addNote(note);
        notesList.getItems().add(title + ": " + content);
        System.out.println("Note added: " + title + " - " + content);
        noteTitle.setText("");
        noteContent.setText("");
    }

    @FXML
    private void onDeleteNote(ActionEvent event) {
        int selectedIndex = notesList.getSelectionModel().getSelectedIndex();
        Note note = notebook.getNotes().get(selectedIndex);
        notebook.removeNote(note);
        notesList.getItems().remove(selectedIndex);
        System.out.println("Note deleted: " + note.getTitle());
    }

}
