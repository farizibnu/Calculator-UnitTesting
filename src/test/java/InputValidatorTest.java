import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class InputValidatorTest {

    @Test
    public void testGetValidIntegerWithValidInput() {
        String input = "3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);
        assertEquals(3, InputValidator.getValidInteger(scanner));
    }

    @Test
    public void testGetValidIntegerWithOutOfRangeInput() {
        String input = "99999\n3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);
        assertEquals(3, InputValidator.getValidInteger(scanner));
    }

    @Test
    public void testGetValidIntegerWithNonIntegerInput() {
        String input = "A\n3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);
        assertEquals(3, InputValidator.getValidInteger(scanner));
    }

    @Test
    public void testGetValidIntegerWithInvalidCombinationInput() {
        String input = "A99999\n3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);
        assertEquals(3, InputValidator.getValidInteger(scanner));
    }

    @Test
    public void testGetValidOperatorWithValidInput() {
        String input = "+\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);
        assertEquals('+', InputValidator.getValidOperator(scanner));
    }

    @Test
    public void testGetValidOperatorWithInvalidInput() {
        String input = "!\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);
        assertThrows(NoSuchElementException.class, () -> InputValidator.getValidOperator(scanner));
    }

    @Test
    public void testGetValidOperatorWithInvalidThenValidInput() {
        String input = "!\n+\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);
        assertEquals('+', InputValidator.getValidOperator(scanner));
    }

    @Test
    public void testCheckDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> InputValidator.checkDivisionByZero('/', 0));
    }

    @Test
    public void testCheckDivisionByNonZero() {
        assertDoesNotThrow(() -> InputValidator.checkDivisionByZero('/', 5));
    }

    @Test
    public void testGetValidOperatorWithMultipleInvalidThenValidInput() {
        String input = "!\n@\n+\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);
        assertEquals('+', InputValidator.getValidOperator(scanner));
    }

    @Test
    public void testGetValidIntegerWithInvalidRangeInput() {
        String input = "100000\n35789\n3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);
        assertEquals(3, InputValidator.getValidInteger(scanner));
    }

    @Test
    public void testGetValidIntegerWithMixedInput() {
        String input = "100000\n35789\nA\n3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);
        assertEquals(3, InputValidator.getValidInteger(scanner));
    }

    @Test
    public void testGetValidIntegerWithNonIntegerInputReapeted() {
        String input = "A\nB\n3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);
        assertEquals(3, InputValidator.getValidInteger(scanner));
    }
    
    @Test
    public void testGetValidIntegerWithInvalidRangeAndNonIntegerInput() {
        String input = "A\nB\n35789\n3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);
        assertEquals(3, InputValidator.getValidInteger(scanner));
    }

    @Test
    public void testGetValidIntegerWithInvalidAndOutOfRangeInput() {
        String input = "A\n99999\n35789\n3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);
        assertEquals(3, InputValidator.getValidInteger(scanner));
    }
}
