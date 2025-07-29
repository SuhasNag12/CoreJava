public class Person {
    String firstName;
    String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void showDetails() {
        System.out.println("Hi " + firstName + " " + lastName);
    }

    public static void dummy() {
        System.out.println("Dummy Method");
    }

}
