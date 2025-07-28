// This program is based on simple Switch statements for Caculator application.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0.00, num2 = 0.00, result = 0.00;
        String operator;
        System.out.print("Enter the first Number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter the first Number: ");
        num2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter an Operator (+, -, *, /): ");
        operator = scanner.nextLine();

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/": {
                if (num2 == 0) {
                    System.out.println("Can not be divided by zero");
                    break;
                } else {
                    result = num1 / num2;
                    break;
                }

            }

            default:
                result = 0.00;
                break;
        }
        System.out.println("Final Result: " + result);
        scanner.close();
    }
}