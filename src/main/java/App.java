import java.util.HashMap;
import java.util.Map;

public class App {

    private static Map<String, Integer> menu = new HashMap<>();

    static {
        menu.put("pizza", 10);
        menu.put("burger", 5);
        menu.put("pasta", 7);
    }

    public static boolean placeOrder(String item, int quantity) {
        if (item == null || item.isEmpty()) {
            return false;
        }
        if (!menu.containsKey(item)) {
            return false;
        }
        if (quantity <= 0) {
            return false;
        }
        return true;
    }

    public static int calculatePrice(String item, int quantity) {
        if (!menu.containsKey(item) || quantity <= 0) {
            return 0;
        }
        return menu.get(item) * quantity;
    }

    public static void main(String[] args) {
        System.out.println("Order 1: " + placeOrder("pizza", 2));
        System.out.println("Order 2: " + placeOrder("cake", 1));
        System.out.println("Total Price: " + calculatePrice("pizza", 2));
    }
}