package task3;

import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    private Map<String, Map<String, Double>> groceryList = new HashMap<>();


    public void addItem(String item, double cost, String category) {
        if (groceryList.containsKey(category)){
            Map<String, Double> existingCat = groceryList.get(category);
            existingCat.put(item, cost);
        } else {
            Map<String, Double> itemOfCategory = new HashMap<>();
            itemOfCategory.put(item, cost);
            groceryList.put(category, itemOfCategory);
        }
    }
    public void displayByCategory(String category) {
        System.out.println(category + " :" );

        for (Map.Entry<String, Double> entry : groceryList.get(category).entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        task3.GroceryListManager myList = new task3.GroceryListManager();
        myList.addItem("bread", 1.5, "bakery");
        myList.addItem("bun", 3.5, "bakery");
        myList.displayByCategory("bakery");

    }
}
