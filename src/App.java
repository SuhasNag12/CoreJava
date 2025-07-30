public class App {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12, 14);
        Circle circle = new Circle(2.2);
        Triangle triangle = new Triangle(2, 3);
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.printf("Area of Circle: %.2f\n", circle.area());
        System.out.println("Area of Triangle: " + triangle.area());
    }
}