package day14_String;

import java.util.*;

class Main {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner input = new Scanner(System.in);

        //WRITE YOUR CODE BELOW

        String guestsList="";

        System.out.println("Please enter the guest's name:");
        String name=input.next();
        guestsList += name;
        System.out.println("Do you want to enter another guest's name?");
        String answer=input.next();
        if(answer.equals("yes"))
            guestsList += ", ";
        while((answer.equals("yes"))){
            System.out.println("Please enter the guest's name:");
            name=input.next();
            guestsList += name;
            System.out.println("Do you want to enter another guest's name?");
            answer=input.next();
            if(answer.equals("yes")){
                guestsList += ", ";
            }
            else if(answer.equals("no")){
                guestsList += "";
            }

        }
        System.out.println("Guests' list: "+guestsList);

        input.close();
    }
}













