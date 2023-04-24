package day39_Recap.ShapeTask;

public class Shape {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shape(String name) {
        if(name==null){
            System.err.println("Name cannot be null");
            System.exit(1);
        }
        if(name.isBlank() || name.isEmpty()){
            System.err.println("Invalid name");
            System.exit(1);
        }

        this.name = name;
    }

    public double area(){
        return 0;
    }
    public double perimeter(){
        return 0;

    }

    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
