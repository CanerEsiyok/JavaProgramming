package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CapitalOne {
    public static void main(String[] args) {
        Employee employee1=new Employee();
        Employee employee2=new Employee();
        Employee employee3=new Employee();
        Employee employee4=new Employee();
        Employee employee5=new Employee();

        employee1.setInfo("John",2237,'M',"Developer",100000,true);
        employee2.setInfo("Anna",2287,'F',"QA",85000,true);
        employee3.setInfo("David",2256,'M',"QA",45000,false);
        employee4.setInfo("Lina",2290,'F',"Manager",80000,true);
        employee5.setInfo("Kevin",2298,'M',"Senior QA",110000,true);

        Employee[] employees={employee1,employee2,employee3,employee4,employee5};
        double max=employees[0].salary;
        for (Employee employee : employees) {
            if(employee.salary>max)
                max=employee.salary;
        }

        ArrayList<Employee> fullTime=new ArrayList<>(Arrays.asList(employees));
        fullTime.removeIf(p->p.isFullTime==false);
        int fullTimeCount=0;
        for (Employee employee : fullTime) {
            fullTimeCount++;
        }
        System.out.println("Number of fullTme employees: "+fullTimeCount);

        ArrayList<Employee> minSalary=new ArrayList<>(Arrays.asList(employees));
        double min=99999999;
        for (Employee employee : minSalary) {
           if(employee.salary<min)
               min=employee.salary;
     }
        System.out.println("min= "+min);
        System.out.println("max= "+max);




    }
}
