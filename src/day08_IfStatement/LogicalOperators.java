package day08_IfStatement;

public class LogicalOperators {
    public static void main(String[] args) {
        int age=19;
        String citizen="USA";
        boolean eligible= age>=18&&citizen=="USA";
        System.out.println("eligible = " + eligible);
        System.out.println("-------------------------------------");
        int age3=21;
        char gender='F';
        boolean isEligible= age>=18 && (gender=='F'|| gender=='M');
        System.out.println("isEligible = " + isEligible);
        System.out.println("---------------------------------");
        String country="France";
        boolean marriage= false;
        boolean eligible2= country!="USA"||marriage==true;
        System.out.println("eligible2 = " + eligible2);
        System.out.println("---------------------");
        boolean result=true;
        boolean result2=!result;
        System.out.println("result = " + result);
        System.out.println("result2 = " + result2);
        int score=85;
        boolean passed=score>=60;
        boolean failed=!passed;

    }
}
