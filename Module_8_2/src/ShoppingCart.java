import java.util.HashMap;

public class ShoppingCart {
    private HashMap<String, Double> items;

    public ShoppingCart () {
        this.items = new HashMap<>();
    }
    public void addItem(String item, double price) {
        items.put(item, price);
        // Logic to add item to the cart
    }
    public void removeItem(String item) {
        items.remove(item);
        // Logic to remove item from the cart
    }
    public double getTotal() {
        return items.values().stream().mapToDouble(Double::doubleValue).sum();
        // Logic to calculate total price
    }
    public int getItemCount() {
        return items.size();
        // Logic to get the number of items in the cart
    }
}
