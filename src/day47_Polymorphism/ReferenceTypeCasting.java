package day47_Polymorphism;

import day39_Recap.ShapeTask.Circle;
import day39_Recap.ShapeTask.Shape;
import day39_Recap.ShapeTask.Square;
import day43_Abstraction.EmployeeTask.Employee;
import day43_Abstraction.EmployeeTask.Tester;
import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Cat;
import day44_Abstraction.animalTask.Dog;

public class ReferenceTypeCasting {
    public static void main(String[] args) {
        Shape shape=(Shape) new Circle(4); //upcasting

        Animal animal=new Dog("Max","Husky",'M',3,"Small","White");
        Dog dog=(Dog) animal;
        dog.bark();
        ((Dog) animal).bark();

        Shape shape1=new Square(5);
        System.out.println(((Square) shape1).getSide());

        Animal animal2=new Cat("Lucy","Husky",'M',3,"Small","White");
        Cat cat=(Cat) animal2;
        cat.eat();

        Employee employee=new Tester("Caner",31,'M',5,"QA",12000);
        ((Tester)employee).bugReport();


    }
}
