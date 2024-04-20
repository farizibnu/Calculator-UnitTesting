import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        assertEquals(8.0f, Calculator.calculate(3.0f, '+', 5.0f));
    }

    @Test
    public void testSubtraction() {
        assertEquals(-2.0f, Calculator.calculate(3.0f, '-', 5.0f));
    }

    @Test
    public void testMultiplication() {
        assertEquals(15.0f, Calculator.calculate(3.0f, '*', 5.0f));
    }

    @Test
    public void testDivision() {
        assertEquals(0.5f, Calculator.calculate(3.0f, '/', 6.0f));
    }

    @Test
    public void testInvalidOperator() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.calculate(3.0f, '!', 5.0f));
    }
}
