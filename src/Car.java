public class Car {
    String name;
    int age;
    String job;
    int salary;

    Car(String name, int age, String job, int salary) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.name + " of age " + this.age + " is working as a " + this.job + " with a salary of " + this.salary;
    }

}
