public class Employee extends Person {
    public double salary;

    public Employee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public String toString() {
       return super.toString() + " $" + salary;
    }
}
