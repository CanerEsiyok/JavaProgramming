package day39_Recap.ShapeTask;

public class Rectangle extends Shape{
    private double width,length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<=0){
            System.err.println("Invalid width "+width);
            System.exit(1);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length<=0){
            System.err.println("Invalid length "+length);
            System.exit(1);
        }
        this.length = length;
    }

    public Rectangle( double width, double length) {
        super("Rectangle");
        setLength(length);
        setWidth(width);
    }

    public double area() {
        return width*length;
    }

    public double perimeter() {
        return (width+length)*2;
    }

    public String toString() {
        return "Square{" +
                "width='" + width + '\'' +
                "length='" + length + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
