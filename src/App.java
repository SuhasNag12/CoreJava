public class App {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();
        Vehicle vehicles[] = { car, bike, boat };

        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }
        System.out.println("**********************************");
        Cat cat = new Cat();
        Dog dog = new Dog();
        Sheep sheep = new Sheep();

        Animal animals[] = { cat, dog, sheep };

        for (Animal animal : animals) {
            animal.eat();
        }

    }
}