import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        /*
         * Variable = a reusable container for a value.
         * a variable behaves as if it was the value it contains
         * 
         * Primitive = Simple value stored directly in memory (Stack)
         * Reference = memory address (stack) that points to the heap.
         * 
         * Primitive vs Reference
         * --------- ---------
         * int array
         * double string
         * char object
         * boolean
         */

        String name = "Suhas Nag";
        int gpa = 6;
        char gender = 'M';
        double pi = 3.14159;
        boolean isAdmin = true;

        System.out.println("My name is: " + name);
        System.out.println("I have a gpa of " + gpa + " and I am an admin.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String userName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int userAge = scanner.nextInt();

        System.out.print("Enter your GPA: ");
        double userScore = scanner.nextDouble();

        System.out.print("Are you an Admin (true/false): ");
        boolean userIsAdmin = scanner.nextBoolean();

        System.out.println("Welcome " + userName);
        System.out.println("Your age is: " + userAge + "\nYou have scored: " + userScore);
        if (userIsAdmin) {

            System.out.println("User is an Admin");
        } else {

            System.out.println("User is an Admin");
        }
        scanner.close();
    }
}