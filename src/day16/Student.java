package day16;

public class Student extends Person implements Comparable<Student>{

        public int rollNumber;

    public Student(String name, int id,int rollNumber) {
        super(name, id);
        this.rollNumber = rollNumber;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + super.getName()+
                "id=" + super.getId()+
                "rollNumber=" + rollNumber +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.rollNumber, o.rollNumber);
    }


//    @Override
//    public int compareTo(Object o) {
//        Student student = (Student) o;
//        return Integer.compare(this.rollNumber, student.rollNumber);
////        return Integer.compare(super.getId(), student.getId());
//    }
}
