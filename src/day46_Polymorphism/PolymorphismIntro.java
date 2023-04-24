package day46_Polymorphism;

import day39_Recap.ShapeTask.Circle;
import day39_Recap.ShapeTask.Shape;
import day39_Recap.ShapeTask.Square;

public class PolymorphismIntro {
    public static void main(String[] args) {
        String str="Wooden Spoon";
        Integer n1=2;
        Double n2=5.5;
        Boolean r1=true;

        Object[] arr={str,n1,n2,r1, new Circle(4),new Square(5)};
        Shape shape=new Circle(5);
        boolean isSquare= shape instanceof Square;
        boolean isCircle=shape instanceof Circle;
        System.out.println("isSquare = " + isSquare);
        System.out.println("isCircle = " + isCircle);

    }
}
