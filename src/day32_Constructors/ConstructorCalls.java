package day32_Constructors;

public class ConstructorCalls {
    public ConstructorCalls(){
        System.out.println("Default Constructor");
    }
    public ConstructorCalls(int a){
        this();
        System.out.println("Constructor with int argument");
    }
    public ConstructorCalls(String str){
        this(10);
        System.out.println("Constructor with String argument");
    }


    public static void main(String[] args) {
        ConstructorCalls con1=new ConstructorCalls();

        System.out.println("--------------------------------");

        ConstructorCalls con2=new ConstructorCalls(10);

        System.out.println("--------------------------------");

        ConstructorCalls con3=new ConstructorCalls("Java");
        System.out.println(con1);
        System.out.println(con2);
        System.out.println(con3);

    }
}
