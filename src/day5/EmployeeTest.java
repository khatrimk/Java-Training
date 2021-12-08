package day5;

import java.time.LocalDate;

public class EmployeeTest {

    public static void main(String[] args) {


        Employee employee = new Employee("Manoj", null, "Khatri","123456", 27, 10000, null);
        Employee employee2 = new Employee("Shyam", "Limdu","121212", 22, 20000, LocalDate.now());
        Employee employee3 = new Employee("Raj", "Shah","1213123", 22, 30000, LocalDate.now());


        employee.riseSalary(10.1);



        employee.displayEmployeeDetails();
        employee2.displayEmployeeDetails();
        employee3.displayEmployeeDetails();

        System.out.println(Employee.getCount());
        System.out.println(Employee.getCount());
        System.out.println(Employee.getCount());

    }
}