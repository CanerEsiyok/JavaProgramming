package day45_Abstraction;

public interface PropertiesOfInterface {
    int a=100;
    static int b=200;

    static void method1(){
        System.out.println("Static method");
    }
    void method2();

    public default void drink(){
        System.out.println("Default method");
    }

}
