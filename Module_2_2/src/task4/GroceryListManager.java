package task4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GroceryListManager {
    private Map<Map<String, Map<String, Double>>, Integer> groceryListWQuantity = new HashMap<>();

    public void addItem(String item, double cost, String category, int quantity) {
        Map<String, Map<String, Double>> groceryList = new HashMap<>();
        Map<String, Double> itemOfCategory = new HashMap<>();
        itemOfCategory.put(item, cost);
        groceryList.put(category, itemOfCategory);

        groceryListWQuantity.put(groceryList,quantity);
    }
    public void displayByCategory(String category){
        for (Map.Entry<Map<String, Map<String, Double>>, Integer> element : groceryListWQuantity.entrySet()) {
            Map<String, Map<String, Double>> item = element.getKey();
            int quan = element.getValue();
            for (Map.Entry<String, Map<String, Double>> el : item.entrySet()) {

                //implement contains
                if(item.containsKey(category)){
                    //I need to get an element by key

                    Map<String, Double> oneItem = item.get(category);
                    System.out.println(category + " :" );
                    for (Map.Entry<String, Double> e : oneItem.entrySet()) {
                        String itemName = e.getKey();
                        double cost = e.getValue();
                        System.out.println(itemName +" " + cost + " eu " + quan +" pcs ");
                    }
                }
            }
        }
    }

    public static void main (String[] args) {
        GroceryListManager myList = new GroceryListManager();
        myList.addItem("bread", 1.5, "bakery", 2);
        myList.addItem("bun", 1.5, "bakery", 2);
        myList.addItem("apples", 3, "vegetables", 2);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a category: ");
        String nameOfCategory = scanner.nextLine();
        myList.displayByCategory(nameOfCategory);
    }
}
