package day11;

public class Manager extends Employee {

    private double bonus;

    public Manager(String firstName, String middleName, String lastName, double salary) {
        super(firstName, middleName, lastName, salary);
    }



    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {

        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", middleName='" + super.getMiddleName() + '\'' +
                ", lastname='" + super.getLastName() + '\'' +
                ", salary='" + super.getSalary() + '\'' +
                ", bonus=" + bonus +
                '}';
    }
    public Manager(String firstName, String lastName, double salary) {
        super(firstName,  lastName, salary);}

}
