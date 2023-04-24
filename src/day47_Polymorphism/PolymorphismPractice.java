package day47_Polymorphism;

import day38_Inheritance.carTest.BMW;
import day38_Inheritance.carTest.Car;
import day38_Inheritance.carTest.Toyota;
import day43_Abstraction.EmployeeTask.Developer;
import day43_Abstraction.EmployeeTask.Employee;
import day43_Abstraction.EmployeeTask.Tester;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismPractice {
    public static void main(String[] args) {
        Employee[] employees = {
                new Tester("Sherali", 32, 'M',1, "QA", 110000),
                new Developer("Zuhal", 27, 'F', 2, "Java Developer", 128000),
                new Tester("George", 28,'M', 3, "SDET", 120000),
                new Developer("Cristina", 23, 'F',4, "Software Developer", 135000),
                new Tester("Cihad", 30, 'M',5, "SDET", 105000),
                new Developer("Gulistan",  26, 'F',6, "Web Developer", 130000),
                new Tester("Yuliya",  28, 'F',7, "QE", 120000),
                new Developer("Cassendra",  29, 'F',8, "Front-end Developer", 140000),
                new Tester("Aygu",  25, 'F',9, "SDET", 130000),
                new Developer("Sophie",  26, 'F',10, "Back-end Developer", 150000),
                new Tester("Timur",  29, 'M',11, "SDET", 115000),
                new Developer("Fady",  26, 'F',12, "Full Stack Developer", 142000),
                new Tester("Iryna",  24, 'F',13, "QE", 125000),
                new Developer("Enes",  26, 'M',14, "Full Stack Developer", 142000),
                new Tester("Mikael",  30, 'M',15, "SDET", 105000),
        };
        List<Employee> scrumMembers = new ArrayList<>();
        List<Tester> testers = new ArrayList<>();
        List<Developer> developers = new ArrayList<>();
        for (Employee employee : employees) {
            if(employee instanceof Tester || employee instanceof Developer)
                scrumMembers.add(employee);
            if(employee instanceof Tester)
                testers.add((Tester) employee);
            if(employee instanceof Developer)
                developers.add((Developer) employee);
        }
       Tester testerWitMaxSalary=testers.get(0);
        for (Tester tester : testers) {
           if(tester.getSalary()>testerWitMaxSalary.getSalary())
               testerWitMaxSalary=tester;

        }
       // System.out.println(testers);
        System.out.println(testerWitMaxSalary);

        Developer developerWithMaxSalary=developers.get(0);
        for(Developer developer:developers){
            if(developer.getSalary()>developerWithMaxSalary.getSalary())
                developerWithMaxSalary=developer;
        }
       // System.out.println(developers);
        System.out.println(developerWithMaxSalary);
    }
    }

