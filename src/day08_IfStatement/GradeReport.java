package day08_IfStatement;

public class GradeReport {
    public static void main(String[] args) {
        int score=85;

        boolean a=90<=score&&score<=100;
        boolean b=80<=score&&score<=89;


        boolean c=70<=score&&score<=79;
        boolean d=60<=score&&score<=69;
        boolean f=!a&&!b&&!c&&!d;
        if(a){
            System.out.println("Excellent");
        }
        if(b){
            System.out.println("Great");
        }
        if(c){
            System.out.println("Good");
        }
        if(d){
            System.out.println("Passed");
        }
        if(f){
            System.out.println("Failed");
        }

    }
}
