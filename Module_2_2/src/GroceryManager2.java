import task1.GroceryListManager;

import java.util.HashMap;
import java.util.Map;

public class GroceryManager2 {
    private Map<String, Double> groceryList = new HashMap<>();

    public void addItem(String item) {
        if (groceryList.containsKey(item)) {
            double amount = groceryList.get(item) +1;
            groceryList.put(item, amount);
            System.out.println(item + " is already in the grocery list");
        } else {
            groceryList.put(item, 1.0);
        }
    }
    public void removeItem(String item) {
        if (groceryList.containsKey(item)) {
            double amount = groceryList.get(item);
            if (amount>1) {
                groceryList.put(item, amount-1.0);
            } else {
                groceryList.remove(item);
            }
            System.out.println("Removing " + item +" from the list...");
            displayList();
        } else {
            System.out.println("There is no such " + item + " in the list");
        }
    }
    public void displayList() {
        System.out.println("Grocery List:");
        for (Map.Entry<String, Double> item : groceryList.entrySet()) {
            String itemName = item.getKey();
            double amount = item.getValue();
            System.out.println(itemName + " : " + amount);
        }
    }

    public static void main(String[] args) {
        GroceryListManager myList = new GroceryListManager();
        myList.addItem("Apples");
        myList.addItem("Milk");
        myList.addItem("Bread");
        myList.displayList();

        myList.checkItem("Milk");
        myList.removeItem("Milk");
    }
}
