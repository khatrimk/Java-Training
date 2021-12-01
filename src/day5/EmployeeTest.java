package day5;

import java.time.LocalDate;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee = new Employee("Manoj", "Kumar", "Khatri", 27, 10000, LocalDate.now());
        Employee employee2 = new Employee("Shyam", "Limdu", 22, 20000, LocalDate.now());
        Employee employee3 = new Employee("Raj", "Shah", 27, 30000, LocalDate.now());

        employee.riseSalary(employee, 10);
        employee.riseSalary(employee2, 12);
        employee.riseSalary(employee3,8);

        employee.displayEmployeeDetails(employee);
        employee2.displayEmployeeDetails(employee2);
        employee3.displayEmployeeDetails(employee3);

    }
}