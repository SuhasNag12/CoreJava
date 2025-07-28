// Below Program utilises Ternary COndition for Conversion of Temp

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        double inputTemp = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Convert to Farenheit or Celcius (f or c): ");
        String inputConversionUnit = scanner.nextLine();

        double result = inputConversionUnit.equalsIgnoreCase("f") ? (inputTemp * (9.0 / 5.0)) + 32
                : inputConversionUnit.equalsIgnoreCase("c") ? (inputTemp - 32) * (5.0 / 9.0) : 0.00;

        System.out.println("Converted Temp: " + result);
        scanner.close();
    }
}