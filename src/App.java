import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = "pizza";
        int wrongGuess = 0;
        ArrayList<Character> wordState = new ArrayList<>();
        System.out.println("Welcome to the Hang-Man game");
        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }
        while (wrongGuess <= 6) {
            System.out.print("Word: ");
            for (char c : wordState) {
                System.out.print(c + " ");
            }
            System.out.print("\nEnter your guess letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if (word.indexOf(guess) >= 0) {
                System.out.println("Your Guess is correct!");
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        wordState.set(i, guess);
                    }
                }
                // Check if word is fully guessed
                if (!wordState.contains('_')) {
                    System.out.println("Congratulations! You guessed the word!");
                    break;
                }
            } else {
                wrongGuess++;
                System.out.println("Wrong Guess!!");
                System.out.println(getHangmanArt(wrongGuess));
            }
        }
        scanner.close();
    }

    static String getHangmanArt(int wrongGuesses) {
        switch (wrongGuesses) {
            case 0:
                return """



                        """;
            case 1:
                return "O";
            case 2:
                return """
                        O
                        |
                        """;
            case 3:
                return """
                         O
                        /|
                         """;
            case 4:
                return """
                         O
                        /|\\
                         """;
            case 5:
                return """
                         O
                        /|\\
                        /
                         """;
            case 6:
                return """
                         O
                        /|\\
                        / \\
                         """;

            default:
                return "";

        }
    }
}