package day12;

public class College {

    public static void main(String[] args) {

        Employee employee = new Employee();

        Student student = new Student();

        System.out.println(employee.getDescription());
        System.out.println(student.getDescription());
        System.out.println(employee.salary());
    }
}
