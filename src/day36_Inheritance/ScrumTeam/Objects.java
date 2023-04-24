package day36_Inheritance.ScrumTeam;

import day36_Inheritance.EmployeeTask.Employee;

import java.util.ArrayList;


public class Objects {
    public static void main(String[] args) {
        Tester tester1=new Tester();
        tester1.setInfo("Mike","SDET",'M',28,14,14000);
        Tester tester2=new Tester();
        tester2.setInfo("Chloe","QA",'F',29,18,45000);
        System.out.println(tester1);
        Tester[] testers={tester1,tester2};
        ScrumTeam team1=new ScrumTeam();





    }
}
