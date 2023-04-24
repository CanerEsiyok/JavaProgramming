package day23_VoidMethod;

public class Practice {
    public static void world(){
        for (int i = 0; i < 5; i++) {
        System.out.println("Hello world");
    }}

public static void cydeo(){
    for (int i = 0; i < 5; i++) {
        System.out.println("Hello Cydeo");
    }

}
public static void even(){
    for (int i = 2; i < 11; i+=2) {
        System.out.print(i+" ");
    }
}

    public static void main(String[] args) {
        world();
        System.out.println("------------------------------");
        cydeo();
        System.out.println("-----------------------------");
        even();
    }
}
