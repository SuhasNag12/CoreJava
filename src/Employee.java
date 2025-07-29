public class Employee extends Person {
    int salary;

    Employee(String firstName, String lastName, int salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    void salary() {
        System.out.println(this.firstName + " " + this.lastName + " salary is " + this.salary);
    }

}
