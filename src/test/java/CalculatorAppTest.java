import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorAppTest {

    @Test
    public void testCalculatorApp() {
        // Prepare test input
        String input = "5\n" + "3\n" + "+\n";

        // Set up input and output streams
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setIn(inputStream);
        System.setOut(new PrintStream(outputStream));

        // Call the main method of CalculatorApp
        CalculatorApp.main(new String[]{});

        // Capture the output
        String[] outputLines = outputStream.toString().split(System.lineSeparator());

        // Assert the output
        assertEquals("Enter first operand: Enter second operand: Choose an operator (+, -, *, /): Result: 8.0", outputLines[0].trim());
    }
}
