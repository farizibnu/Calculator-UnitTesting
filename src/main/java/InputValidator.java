import java.util.Scanner;

public class InputValidator {
    public static float getValidInteger(Scanner scanner) {
        int num = 0;
        boolean validInput;
        int minValue = -32768;
        int maxValue = 32767;
        String errorMessage = "Invalid input. Please enter an integer value between " + minValue + " and " + maxValue + ".";

        do {
            validInput = false;
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                if (num >= minValue && num <= maxValue) {
                    validInput = true;
                } else {
                    System.out.println(errorMessage);
                    System.out.print("Enter a valid integer value: ");
                    scanner.nextLine(); // Consume the newline character
                }
            } else {
                System.out.println(errorMessage);
                System.out.print("Enter a valid integer value: ");
                scanner.next(); // Discard the non-integer input
                scanner.nextLine(); // Consume the newline character
            }

        } while (!validInput);

        return num;
    }

    public static char getValidOperator(Scanner scanner) {
        char operator;
        String errorMessage = "Invalid operator. Supported operators are +, -, *, /";

        do {
            operator = scanner.next().charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                break;
            } else {
                System.out.println(errorMessage);
                System.out.print("Enter operator (+, -, *, /): ");
            }
        } while (true);

        return operator;
    }

    public static void checkDivisionByZero(char operator, float operand2) {
        if (operator == '/' && operand2 == 0) {
            throw new IllegalArgumentException("Invalid input. Division by zero is not allowed.");
        }
    }
}
