import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first operand: ");
        float operand1 = InputValidator.getValidInteger(scanner);

        System.out.print("Enter second operand: ");
        float operand2 = InputValidator.getValidInteger(scanner);

        // Consume the newline character
        scanner.nextLine();

        System.out.print("Choose an operator (+, -, *, /): ");
        char operator = InputValidator.getValidOperator(scanner);
        InputValidator.checkDivisionByZero(operator, operand2);

        float result = Calculator.calculate(operand1, operator, operand2);
        System.out.println("Result: " + result);
    }
}
