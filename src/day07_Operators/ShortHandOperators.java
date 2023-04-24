package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int number=100;
        System.out.println("number = " + number);
        number=200;
        System.out.println("number = " + number);
        String word="Java Programming";
        System.out.println("word = " + word);
        word="Caner Esiyok";
        System.out.println("word = " + word);
        word="Cydeo";
        System.out.println("word = " + word);
        word="123";
        System.out.println(word+1);
        int x=100;
        System.out.println("x = " + x);
        x+=200;
        System.out.println("x = " + x);
        String str="Wooden";
        str+=" Spoon";
        System.out.println("str = " + str);
        double availableBalance=1000.5;
        availableBalance+=300;
        System.out.println("availableBalance = " + availableBalance);
        availableBalance-=500;
        System.out.println("availableBalance = " + availableBalance);
        double salary=50000.5;
        salary*=2;
        System.out.println("salary = " + salary);
        double num2=25000;
        num2/=2;
        System.out.println("num2 = " + num2);
        int num3=100;
        //num3=num3%3;
        num3%=3;
        System.out.println("num3 = " + num3);
        int amount=127;
        int quarters=amount/25;
        int cents=amount%25;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);
        int cents2=127;
        cents2%=25;
        System.out.println("cents2 = " + cents2);
        int y=300;
        y%=16;
        System.out.println("y = " + y);
        int balance=3500;
        balance%=153;
        System.out.println("balance = " + balance);



    }
}
