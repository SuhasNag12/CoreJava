import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Item you would like to buy: ");
        String itemName = scanner.nextLine();

        System.out.print("Enter the Price for each: ");
        double itemPrice = scanner.nextDouble();

        System.out.print("Quantity of the product: ");
        int itemQuantity = scanner.nextInt();
        double itemTotal = itemPrice * itemQuantity;
        System.out.println("You have bought " + itemQuantity + " " + itemName + "/s");
        System.out.println("Your total is: " + itemTotal + " Rs.");
        scanner.close();
    }
}
