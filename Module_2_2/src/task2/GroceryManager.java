package task2;


import java.util.HashMap;
import java.util.Map;

public class GroceryManager {
    private Map<String, Double> groceryList = new HashMap<>();

    public void addItem(String item, double cost) {
        groceryList.put(item, cost);
    }
    public double calculateTotalCost() {
        double totalCost = 0;
        for (Map.Entry<String, Double> item : groceryList.entrySet()) {
            String itemName = item.getKey();
            totalCost += item.getValue();
        }
        System.out.println("Total cost of grocery list: " + totalCost);
        return totalCost;
    }
    public static void main(String[] args) {
        GroceryManager myList = new GroceryManager();
        myList.addItem("bread", 1.5);
        myList.addItem("bun", 3.5);
        myList.calculateTotalCost();
    }
}
