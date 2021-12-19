package day11;

public class InheritanceTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ram", "Kumar", "Silwal", 2000);
        System.out.println(employee1.toString());
        System.out.println(employee1.getSalary());

        Employee employee2 = new Employee("Shyam", "Karki", 2000);
        System.out.println(employee2.toString());
        System.out.println(employee2.getSalary());

        Manager manager1 = new Manager("Lalan", "Sigh", "Yadav", 3000);
        manager1.setBonus(200);
        System.out.println(manager1.toString());
        System.out.println(manager1.getSalary());

        Executive executive = new Executive("abc", "de", "xyz", 5000);
        executive.setBonus(500);
        System.out.println(executive.toString());
        System.out.println(executive.getSalary());


        Programmer programmer = new Programmer("ASD", "QQQ", "WWW", 4000);
        System.out.println(programmer.toString());
        System.out.println(programmer.getSalary());





       Employee[] staffs = new Employee[3];
       Manager boss = new Manager("HARI", "LAL", 2000);
       staffs[0] = boss;
       staffs[1] = employee1;




        if(staffs[1] instanceof Manager){
        Manager manager = (Manager) staffs[0];
        manager.setBonus(200);
        }




//        double normalSalary = manager1.getSalary();
//        double bonus = manager1.getBonus();
//
//        double totalSalary = normalSalary + bonus;





    }


}
