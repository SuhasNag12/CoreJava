import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principal;
        double interestRate;
        double time;
        double number;
        double output;

        System.out.print("Enter the Principal Amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the Interest Rate (in %): ");
        interestRate = scanner.nextDouble();

        System.out.print("Enter the # of times compunded per year: ");
        number = scanner.nextDouble();

        System.out.print("Enter the # of years: ");
        time = scanner.nextDouble();

        output = principal * Math.pow(1 + (interestRate/100) / number, (number * time));

        System.out.println("The amount after 1 years is: " + output);
    }
}