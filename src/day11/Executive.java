package day11;

public final class Executive extends Manager{



    public  Executive (String firstName, String middleName, String lastName, double salary){
       super(firstName, middleName, lastName, salary);

    }

//    public double getSalary() {
//        return super.getSalary() ;
//    }



    @Override
    public String toString() {
        return "Executive{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", middleName='" + super.getMiddleName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", salary='" + super.getSalary() + '\'' +
                "bonus='" + super.getBonus() +
                "}";
    }
}

