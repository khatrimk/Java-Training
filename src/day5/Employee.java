package day5;


import java.time.LocalDate;
import java.util.Objects;

public class Employee {

    private String firstName;
    private String middleName;
    private String lastName;
    private String socialSecurityNumber;
    private int age;
    private double salary;
    private LocalDate hireDate;
    private static int count = 0;


    private Employee() {
    }  //Defaut Construster

    //    Parameterized Construster
    public Employee(String firstName, String lastName,String socialSecurityNumber, int age, double salary, LocalDate hireDate) {
       count +=1;
        this.firstName = Objects.requireNonNullElse(firstName, "Unknown");

        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.age = age;
        this.salary = salary;
        this.hireDate = Objects.requireNonNullElse(hireDate, LocalDate.now());


//        if (hireDate == hireDate) {
//            this.hireDate = LocalDate.now();
//        } else {
//            this.hireDate = hireDate;
//        }

    }

    public Employee(String firstName,String middleName, String lastName, String socialSecurityNumber, int age, double salary, LocalDate hireDate) {
        this(firstName,lastName, socialSecurityNumber, age, salary, hireDate); //always in first line of construster

        this.middleName = middleName;

    }


    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getCount() {
        return count;
    }

    public void riseSalary(double percentage) {
        this.salary += (this.salary * percentage) / 100;
    }
    public void riseSalary(int percentage) {
        this.salary += (this.salary * percentage) / 100;
    }

    public void displayEmployeeDetails() {
        System.out.println(this.firstName);
        System.out.println(this.middleName);
        System.out.println(this.lastName);
        System.out.println(this.age);
        System.out.println(this.salary);
        System.out.println(this.hireDate.toString());  //null.toString()


    }

}
