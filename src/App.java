public class App {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.alive());
        animal.eat();

        Dog dog = new Dog();
        dog.eat();

        Cat cat = new Cat();
        cat.eat();

    }
}