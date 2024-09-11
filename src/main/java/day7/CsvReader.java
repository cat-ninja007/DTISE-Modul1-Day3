package day7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvReader {
    public static void main(String[] args) {
        String csvFile = "/Users/macbookpro/Documents/JavaLabs/dtise2024-modul1/src/main/java/day7/product_sales_data.csv";
        calculateSummary(csvFile);
    }

    public static void calculateSummary(String filePath) {
        String line;
        String csvSplitBy = ",";
        String[] productNames = new String[1000];  // Adjust array size based on expected number of products
        int[] totalSold = new int[1000];
        double[] itemPrice = new double[1000];
        int productCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine();  // Skip header line

            // Read each line from the file
            while ((line = br.readLine()) != null) {
                String[] columns = line.split(csvSplitBy);

                try {
                    String productName = columns[0];
                    int soldQuantity = Integer.parseInt(columns[1].trim());
                    double price = Double.parseDouble(columns[2].trim());

                    productNames[productCount] = productName;
                    totalSold[productCount] = soldQuantity;
                    itemPrice[productCount] = price;
                    productCount++;

                } catch (NumberFormatException e) {
                    System.out.println("Invalid number format in row: " + line);
                }
            }

            // Calculate summary
            calculateAndPrintSummary(productNames, totalSold, itemPrice, productCount);

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    public static void calculateAndPrintSummary(String[] productNames, int[] totalSold, double[] itemPrice, int productCount) {
        double totalSales = 0;
        int totalQuantitySold = 0;
        String mostBoughtProduct = null;
        String leastBoughtProduct = null;
        int maxQuantity = Integer.MIN_VALUE;
        int minQuantity = Integer.MAX_VALUE;

        for (int i = 0; i < productCount; i++) {
            totalSales += totalSold[i] * itemPrice[i];
            totalQuantitySold += totalSold[i];

            if (totalSold[i] > maxQuantity) {
                maxQuantity = totalSold[i];
                mostBoughtProduct = productNames[i];
            }

            if (totalSold[i] < minQuantity) {
                minQuantity = totalSold[i];
                leastBoughtProduct = productNames[i];
            }
        }

        // Print the summary
        System.out.println("Total Sales: " + totalSales);
        System.out.println("Total Products Sold: " + totalQuantitySold);
        System.out.println("Most Bought Product: " + mostBoughtProduct);
        System.out.println("Least Bought Product: " + leastBoughtProduct);
    }
}
