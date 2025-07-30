public class Car {
    String name;
    int price;
    Engine engine;

    Car(String name, int price, String engineType) {
        this.name = name;
        this.price = price;
        this.engine = new Engine(engineType);
    }
}
