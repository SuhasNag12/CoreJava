import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) {
        String filePath = "test.txt";
        String textContent = """
                My Name is Suhas Nag.
                I like to code.
                My favourite food is Fried Chicken.
                Test this document.
                """;
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(textContent);
            System.out.println("Successfuly Created.");
        } catch (Exception e) {
            System.out.println("Something Went Wrong!");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("Success!!!");
        } catch (Exception e) {
            System.out.println("Something went Wrong!!");
        }
    }
}