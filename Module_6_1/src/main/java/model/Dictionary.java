package model;

import java.util.HashMap;

public class Dictionary {
    HashMap<String, String> dictionary = new HashMap<String, String>();

    public Dictionary(){
        preload();
    }

    public void addWord(String word, String definition) {
        dictionary.put(word, definition);
    }

    public String getDefinition(String word) {
        if (word.isEmpty()) {
            return "Please enter a word";
        }
        if (!dictionary.containsKey(word)) {
            return "Word not found";
        }
        return dictionary.get(word);
    }
    public void preload () {
        addWord("kissa", "cat");
        addWord("koira", "dog");
        addWord("talo", "house");
        addWord("puu", "tree");
        addWord("auto", "car");
        addWord("kirja", "book");
        addWord("vesi", "water");
        addWord("aurinko", "sun");
        addWord("kuu", "moon");
        addWord("joki", "river");
    }
}
