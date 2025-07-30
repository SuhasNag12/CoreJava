public class App {
    public static void main(String[] args) {
        Car car = new Car("Corvette Stingray", 230000, "6.2L LT2 V8");
        System.out.println("My car name is " + car.name + " I bought it for " + car.price
                + ". It is having an engine of type: " + car.engine.type);
        car.engine.start();

    }
}