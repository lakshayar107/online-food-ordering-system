import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testValidOrder() {
        assertTrue(App.placeOrder("pizza", 2));
    }

    @Test
    void testInvalidItem() {
        assertFalse(App.placeOrder("cake", 1));
    }

    @Test
    void testInvalidQuantity() {
        assertFalse(App.placeOrder("burger", 0));
    }
}