package day13_StringClass;

import java.util.Scanner;

public class calledTravel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Do you have a valid passport?:");
        String passport= sc.next();
        if(passport.equals("yes")||passport.equals("Yes")){
            int cost=1000;

            sc.nextLine();
            System.out.println("Which country are you travelling to?:");
            String country= sc.nextLine();
            System.out.println("How many bags will you take with you?:");
            byte bags= sc.nextByte();
            cost+=bags*50;
            System.out.println("How many people are you travelling with?:");
            short people=sc.nextShort();
                if(people<=3)
                    cost-=cost*people;
                else cost-=300;
            sc.nextLine();
            System.out.println("Type in the name of the people with whom you will travel:");
            String name=sc.nextLine();
            System.out.println("Your ticket is booked to "+country+". We have charged extra for the "+bags+" bags but you are travelling with "
            +people+" so we are giving you a discount. Your total cost is "+cost);

        } else {
            int cost=200;
            System.out.println("When did your passport expire?:");
            int exp= sc.nextInt();
            cost+=75*(2022-exp);
            sc.nextLine();
            System.out.println("Which country do you plan to travel?:");
            String country=sc.nextLine();
            System.out.println("Will you be travelling next year?(Yes/No):");
            String nextYear= sc.next();
            if(nextYear.equals("yes"))
                cost+=100;
            else cost-=50;

            System.out.println("Looks like your passport has been expired for "+(2022-exp)+" years, but not to worry." +
                    " We will get it ready to travel to "+country+". Your total cost has come out to "+cost);



        }

    }
}
