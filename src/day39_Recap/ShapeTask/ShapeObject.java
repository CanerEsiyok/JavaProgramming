package day39_Recap.ShapeTask;

public class ShapeObject {
    public static void main(String[] args) {
        Square square=new Square(10);
        System.out.println(square);
        square.setSide(20);
        System.out.println(square);

        Rectangle rectangle=new Rectangle(5,6);
        System.out.println(rectangle);
        rectangle.setWidth(8);
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle);
        System.out.println(rectangle.getName());

        Circle circle=new Circle(7.5);
        System.out.println(circle);
        circle.setRadius(15.5);
        System.out.println(circle.getRadius());
        System.out.println(circle);
        System.out.println(circle.getName());


    }
}
