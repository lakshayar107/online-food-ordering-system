import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {

    @BeforeEach
    void setup() {
        // Setup if needed (fresh state)
    }

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

    @Test
    void testNullItem() {
        assertFalse(App.placeOrder(null, 1));
    }

    @Test
    void testEmptyItem() {
        assertFalse(App.placeOrder("", 1));
    }

    @Test
    void testCalculatePriceValid() {
        assertEquals(20, App.calculatePrice("pizza", 2));
    }

    @Test
    void testCalculatePriceInvalidItem() {
        assertEquals(0, App.calculatePrice("cake", 2));
    }

    @Test
    void testCalculatePriceInvalidQuantity() {
        assertEquals(0, App.calculatePrice("pizza", 0));
    }
}