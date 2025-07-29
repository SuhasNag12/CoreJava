public class App {
    public static void main(String[] args) {
        Person person = new Person("Suhas", "Nag");
        person.showDetails();

        Student student = new Student("Vinay", "Prasad", 4.66);
        student.showDetailsStudent();

        Employee employee = new Employee("Kishore", "Kumar", 46000);

        employee.salary();

        Employee listEmployee[] = new Employee[3];

        listEmployee[0] = new Employee("Person", "5", 12000);
        listEmployee[1] = new Employee("Person", "6", 13000);
        listEmployee[2] = new Employee("Person", "7", 15000);
        for (Employee individualEmployee : listEmployee) {
            individualEmployee.salary();
        }
    }
}