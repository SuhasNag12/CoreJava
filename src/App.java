import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        Animal animal;
        System.out.print("Enter your choice for Dog or Cat (1 = Dog and 2 = Cat): ");
        userInput = scanner.nextInt();
        switch (userInput) {
            case 1: {
                animal = new Dog();
                animal.speak();
                break;
            }
            case 2: {
                animal = new Cat();
                animal.speak();
                break;
            }
            default:
                System.out.println("Error!! Invalid Input.");
                break;
        }
        scanner.close();
    }
}