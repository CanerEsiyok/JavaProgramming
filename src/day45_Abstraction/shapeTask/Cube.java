package day45_Abstraction.shapeTask;

public class Cube extends Shape implements Volume{
    @Override
    public double area() {
        return 0;
    }

    @Override
    public double parameter() {
        return 0;
    }

    public Cube(String name) {
        super(name);
    }

    @Override
    public double volume() {
        return 0;
    }
}
