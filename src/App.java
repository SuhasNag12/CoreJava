public class App {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Lion lion = new Lion();
        Fish fish = new Fish();
        lion.hunt();
        rabbit.flee();
        fish.hunt();
        fish.flee();
    }
}