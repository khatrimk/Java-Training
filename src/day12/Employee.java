package day12;

public class Employee extends Person {
    public String getDescription(){
        return "an employee with salary of 4000";
    }
    public int salary(){
        return (1000);
    }

    @Override
    public String getName() {
        return null;
    }

}
