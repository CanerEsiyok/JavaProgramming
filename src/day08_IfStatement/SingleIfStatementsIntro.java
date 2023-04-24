package day08_IfStatement;

public class SingleIfStatementsIntro {
    public static void main(String[] args) {
        int number=301;
       /* if(number%2==0){
            System.out.println(number+" is an even number");

        }
        else{
            System.out.println(number+" is an odd number");

        } */
            boolean evenNumber=number%2==0;
        if(evenNumber){
            System.out.println(number+" is an even number");
        }
        if(!evenNumber){
            System.out.println(number+" is an odd number");
        }
        System.out.println("-------------------------------");
        int n=200;
        if(n>0){
            System.out.println(n+" is a positive number");
        }
        if(n<0){
            System.out.println(n+" is a negative number");
        }
        if(n==0){
            System.out.println(n+" is equal to zero");
        }

    }

}
