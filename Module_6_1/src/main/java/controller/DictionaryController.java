package controller;

import model.Dictionary;
import view.DictionaryView;

public class DictionaryController {
    Dictionary dictionary = new Dictionary();
    private DictionaryView view;

    public DictionaryController( DictionaryView view) {
        this.view = view;
    }

    public void addWord(String word, String definition) {
        dictionary.addWord(word, definition);
    }

    public String getDefinition(String word) {
        return dictionary.getDefinition(word);
    }
}
