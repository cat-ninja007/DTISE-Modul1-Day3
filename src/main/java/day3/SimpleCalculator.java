package day3;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an expression (e.g., 5 + 3): ");
        String expression = scanner.nextLine();

        char operator = getOperator(expression);
        double operand1 = Double.parseDouble(expression.substring(0, expression.indexOf(operator)));
        double operand2 = Double.parseDouble(expression.substring(expression.indexOf(operator) + 1));

        double result = calculate(operand1, operand2, operator);

        System.out.println("Result: " + result);
    }

    private static char getOperator(String expression) {
        char[] operators = {'+', '-', '*', '/'};
        for (char operator : operators) {
            if (expression.contains(String.valueOf(operator))) {
                return operator;
            }
        }
        return '\0'; // Invalid operator
    }

    private static double calculate(double operand1, double operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    System.out.println("Error: Division by zero");
                    return Double.NaN;
                }
                return operand1 / operand2;
            default:
                System.out.println("Error: Invalid operator");
                return Double.NaN;
        }
    }
}
