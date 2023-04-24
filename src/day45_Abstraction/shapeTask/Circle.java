package day45_Abstraction.shapeTask;

public class Circle extends Shape {
    private double radius;
    public final static double pi=3.14;

    public Circle( double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<0)
            throw new RuntimeException("Radius can not be negative: "+radius);
        this.radius = radius;
    }


    @Override
    public double area() {
        return pi*radius*radius;
    }

    @Override
    public double parameter() {
        return 2*pi*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString()+
                ",  radius=" + radius +
                '}';
    }
}
