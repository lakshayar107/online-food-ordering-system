import java.util.HashMap;
import java.util.Map;

public class App {

    static Map<String, Integer> menu = new HashMap<>();

    static {
        menu.put("pizza", 10);
        menu.put("burger", 5);
        menu.put("pasta", 7);
    }

    public static boolean placeOrder(String item, int quantity) {
        if (!menu.containsKey(item)) {
            return false; // invalid item
        }
        if (quantity <= 0) {
            return false; // invalid quantity
        }
        return true; // success
    }

    public static void main(String[] args) {
        System.out.println(placeOrder("pizza", 2));  // true
        System.out.println(placeOrder("cake", 1));   // false
    }
}