public class App {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Blue");
        car.setName("Tata Nexon");
        car.setPrice(950000);
        System.out.println(
                "I bought " + car.getName() + " of color " + car.getColor() + " for a price of Rs" + car.getPrice());
    }
}