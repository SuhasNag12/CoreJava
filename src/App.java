public class App {

    public static void main(String[] args) {
        /*
         * Variable = a reusable container for a value.
         * a variable behaves as if it was the value it contains
         * 
         * Primitive = Simple value stored directly in memory (Stack)
         * Reference = memory address (stack) that points to the heap.
         * 
         * Primitive vs Reference
         * --------- ---------
         * int array
         * double string
         * char object
         * boolean
         */

        String name = "Suhas Nag";
        int gpa = 6;
        char gender = 'M';
        double pi = 3.14159;
        boolean isAdmin = true;

        System.out.println("My name is: " + name);
        System.out.println("I have a gpa of " + gpa + " and I am an admin.");

    }
}