package day35_Encapsulation.encapculation;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1=new Employee("Tatiana",'F',28,110000);
       // System.out.println(employee1);
        employee1.setAge(29);
      //  System.out.println(employee1);

        Employee employee2=new Employee("Ece",'F',23,120000);
        employee2.setName("Elvira");
        employee2.setSalary(employee2.getSalary()+15000);

        System.out.println(employee1);
        System.out.println(employee2);
    }
}
