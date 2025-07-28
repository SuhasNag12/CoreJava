
// This program converts KG to Pounds or Pounds to KG based on user input:
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kgWeight;
        double lbsWeight;
        double convertedWeight = 0.00;

        System.out.println("Welcome to Weight Conversion Program: ");
        System.out.println("1: Convert Lbs to KG");
        System.out.println("2: Convert KG to Lbs");
        System.out.print("Enter Your Choice (1 or 2): ");
        int userInput = scanner.nextInt();
        if (userInput == 1) {
            System.out.print("Enter the Weight in Lbs: ");
            lbsWeight = scanner.nextDouble();
            convertedWeight = lbsWeight * 0.453592;
        } else if (userInput == 2) {
            System.out.print("Enter the Weight in Kgs: ");
            kgWeight = scanner.nextDouble();
            convertedWeight = kgWeight * 2.20462;
        } else {
            System.out.println("You have entered wrong Choice, Restart the Program");

        }
        System.out.printf("Converted Weight is: %.2f", convertedWeight);
        scanner.close();
    }
}