package day16;

public class Teacher extends Person implements Comparable <Teacher>{

    private double salary;

    public  Teacher(String name, double salary){
        super(name);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name=" + super.getName()+
                "salary=" + salary +
                '}';
    }


    @Override
    public int compareTo(Teacher o) {
        return Double.compare(this.salary, o.salary ) ;
    }
}
