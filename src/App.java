import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>();
        System.out.print("Enter the number of food items that needs to be stored in an array: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= num; i++) {
            System.out.print("Enter the item number " + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println("Final List of food items: " + foods);

        scanner.close();
    }
}