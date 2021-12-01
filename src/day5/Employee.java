package day5;

import java.time.LocalDate;

public class Employee {

    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private double salary;
    private LocalDate hireDate;


    private Employee() {}  //Defaut Construster

    //    Parameterized Construster
    public Employee(String firstName, String middleName, String lastName, int age, double salary, LocalDate hireDate) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public Employee(String firstName, String lastName, int age, double salary, LocalDate hireDate) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.hireDate = hireDate;

    }

    public void riseSalary(Employee employee, double percentage){
        employee.salary += (employee.salary * percentage)/100;
    }

//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getMiddleName() {
//        return middleName;
//    }
//
//    public void setMiddleName(String middleName) {
//        this.middleName = middleName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    public LocalDate getHireDate() {
//        return hireDate;
//    }
//
//    public void setHireDate(LocalDate hireDate) {
//        this.hireDate = hireDate;
//    }

    public void displayEmployeeDetails(Employee employee){
        System.out.println(employee.firstName);
        System.out.println(employee.middleName);
        System.out.println(employee.lastName);
        System.out.println(employee.age);
        System.out.println(employee.salary);
        System.out.println(employee.hireDate);



    }

}
