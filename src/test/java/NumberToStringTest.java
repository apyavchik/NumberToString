import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberToStringTest {
    @Test
    public void tests() {
        assertEquals("67", NumberToString.numberToString(67));
        assertEquals("123", NumberToString.numberToString(123));
        assertEquals("999", NumberToString.numberToString(999));
    }
}