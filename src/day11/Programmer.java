package day11;

public class Programmer extends Employee {

    public Programmer(String firstName, String middleName, String lastName, double salary) {
        super(firstName, middleName, lastName, salary);

    }


    public String toString() {
        return "Programmer{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", middleName='" + super.getMiddleName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", salary=" + super.getSalary() +
                '}';
    }

//    public double getSalary() {
//        return super.getSalary();
//    }
}
