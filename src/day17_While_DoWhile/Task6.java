package day17_While_DoWhile;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name= sc.nextLine();
        System.out.println("Enter your gender:");
        String gender= sc.next().toLowerCase();
        while (!(gender.equals("m")|| gender.equals("f"))){
            System.err.println("Invalid entry, please re-enter::");
            gender= sc.next().toLowerCase();
        }
        System.out.println("Are you married?yes/no");
        String married= sc.next().toLowerCase();
        while(!(married.equals("yes")|| married.equals("no"))){
            System.err.println("Invalid entry, please re-enter::");
            married= sc.next().toLowerCase();

        }
        System.out.println("Enter your age:");
        int age= sc.nextInt();
        while(age<0 || age>120) {
            System.err.println("Invalid entry, please re-enter::");
            age= sc.nextInt();
        }
        System.out.println("How many miles do you drive in a day?");
        int mileage= sc.nextInt();
        while(mileage<5){
            System.err.println("Invalid entry, please re-enter::");
            mileage= sc.nextInt();
        }sc.nextLine();
        System.out.println("Do you want full coverage or liability insurance?");
        String ins=sc.nextLine();
        System.out.println("Did you have any accidents or claims in last 5 years?yes/no");
        String acc= sc.next().toLowerCase();
        while(!(acc.equals("yes")|| acc.equals("no"))){
            System.err.println("Invalid entry, please re-enter::");
            acc= sc.next().toLowerCase();
        }
        System.out.println("Does your car have an anti-theft device?");
        String anti= sc.next().toLowerCase();
        while(!(anti.equals("yes")|| anti.equals("no"))){
            System.err.println("Invalid entry, please re-enter::");
            anti= sc.next().toLowerCase(); }
        int price=0;
        if(ins.equals("liability")) {
        if(age<25)
            price+=90;
        else
            price+=50;
        if(mileage<=10)
            price+=10;
        else if (mileage>10&&mileage<=50)
            price+=30;
        else
            price+=50;}
        else if(ins.equals("full coverage")){
            price+=age<25?160:120;
            price+=mileage<=10?20:mileage>10&&mileage<=50?40:70;

        } if(anti.equals("yes"))
            price-=price*0.05;
        if(acc.equals("yes"))
            price+=price*0.15;
        else
            price-=price*0.1;
        if (married.equals("yes"))
            price-=price*0.05;

        System.out.println(price+"$");


}}
