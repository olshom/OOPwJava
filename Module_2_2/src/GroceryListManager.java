import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addItem(String item) {
        if (groceryList.contains(item)) {
            System.out.println(item + " is already in the grocery list");
        } else {
            groceryList.add(item);
        }
    }
    public void removeItem(String item) {
        if (groceryList.contains(item)) {
            System.out.println("Removing " + item +" from the list...");
            groceryList.remove(item);
            displayList();
        } else {
            System.out.println("There is no such " + item + " in the list");
        }
    }
    public void displayList() {
        System.out.println("Grocery List:");
        for (String item : groceryList) {
            System.out.println(item);
        }
    }
    public boolean checkItem(String item) {
        if (groceryList.contains(item)) {
            System.out.println("Is " + item + " in the grocery list? true");
            return true;
        }
        System.out.println("Is " + item + " in the grocery list? false");
        return false;
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
