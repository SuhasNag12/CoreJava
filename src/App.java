import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to finding Area of a rectangle.");

        System.out.print("Enter Lenght of the Rectangle: ");
        double rectLength = scanner.nextDouble();

        System.out.print("Enter Width of the Rectangle: ");
        double rectWidth = scanner.nextDouble();

        double rectArea = rectLength * rectWidth;
        System.out.println("Area of the Rectangle is: " + rectArea + " cm²");

        scanner.close();

    }
}