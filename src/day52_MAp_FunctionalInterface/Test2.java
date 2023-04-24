package day52_MAp_FunctionalInterface;

public class Test2 {
    public static void main(String[] args) {

        MySecondFunctionalInterface<String> printEach= s->{
            for (String s1 : s.split("")) {
                System.out.println(s1);
            }
        };
        printEach.test("Caner");


        MySecondFunctionalInterface<Integer>cube=n->{
            System.out.println(n*n*n);
        };
        cube.test(3);

    }
}
