package exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class SalesReport {
    private static final String FILE_PATH = "/Users/macbookpro/Documents/JavaLabs/dtise2024-modul1/src/main/java/day7/product_sales_data.csv";
    private static final String DELIMITER =  ",";
    private static final String DATA_HEADER = "Product Name, Total Sold, Item Price";

    public static List<Product> readProductFromCsv(){
        List<Product> products = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String header = br.readLine();
            if(header == null || !header.equalsIgnoreCase(DATA_HEADER)){
                throw new IllegalArgumentException("Invalid CSV file format");
            }

            String line;
            while((line = br.readLine()) != null){

            }
        } catch (Exception e){
            System.out.println("Something went wrong: " + e.getMessage());
        }
        return products;
    }

    private  static Product createProduct(String[] values){
        return new Product();
    }

    public static void main(String[] args) {
        readProductFromCsv();
    }
}
