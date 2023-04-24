package day35_Encapsulation;

public class SquareObject {
    public static void main(String[] args) {
        Square square1=new Square(5);
        System.out.println(square1);
        System.out.println(square1.calcArea());
        System.out.println(square1.calcPerimeter());
    }
}
