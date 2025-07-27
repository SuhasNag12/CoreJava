import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Rolling the Dice.");
        int diceNum = random.nextInt(1, 7);
        System.out.println("You got the number: " + diceNum);
    }
}