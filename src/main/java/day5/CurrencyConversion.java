package day5;

import java.util.Scanner;

public class CurrencyConversion {

    // Predefined exchange rates
    private static final double USD_TO_EUR = 0.92;
    private static final double EUR_TO_USD = 1.0 / USD_TO_EUR;
    private static final double USD_TO_GBP = 0.79;
    private static final double USD_TO_JPY = 147.65;
    private static final double JPY_TO_USD = 1.0 / USD_TO_JPY;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: amount, source currency, and target currency
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the source currency (USD, EUR, GBP, or JPY): ");
        String sourceCurrency = scanner.next().toUpperCase();

        System.out.print("Enter the target currency (USD, EUR, GBP, or JPY): ");
        String targetCurrency = scanner.next().toUpperCase();

        double convertedAmount = convertCurrency(amount, sourceCurrency, targetCurrency);

        // Output the converted amount
        if (convertedAmount != -1) {
            System.out.printf("%.2f %s is equal to %.2f %s%n", amount, sourceCurrency, convertedAmount, targetCurrency);
        } else {
            System.out.println("Invalid currency conversion.");
        }

        scanner.close();
    }

    // Method to handle currency conversion
    private static double convertCurrency(double amount, String source, String target) {
        // Convert from source to USD first, then to target currency
        double amountInUsd = convertToUSD(amount, source);
        if (amountInUsd == -1) return -1;  // Invalid source currency

        return convertFromUSD(amountInUsd, target);
    }

    // Convert from the source currency to USD
    private static double convertToUSD(double amount, String source) {
        return switch (source) {
            case "USD" -> amount;
            case "EUR" -> amount * EUR_TO_USD;
            case "GBP" -> amount * (1.0 / USD_TO_GBP);
            case "JPY" -> amount * JPY_TO_USD;
            default -> -1;  // Invalid source currency
        };
    }

    // Convert from USD to the target currency
    private static double convertFromUSD(double amount, String target) {
        return switch (target) {
            case "USD" -> amount;
            case "EUR" -> amount * USD_TO_EUR;
            case "GBP" -> amount * USD_TO_GBP;
            case "JPY" -> amount * USD_TO_JPY;
            default -> -1;  // Invalid target currency
        };
    }
}

