package week06;

import java.util.Scanner;

public class tipCalculator {
    /*create a scanner to ask the user the bill amount
    ask the user to enter tip ratio
    do not accept less than 5 percent or more than 20 percent
    convert it to a decimal between 0-1
    calculate the tip amount
    calculate the total amount
    round up the total amount
    print out both
    */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the bill amount: ");
        double billAmount= sc.nextDouble();
        double tipRatio;
        while (true) {
            System.out.println("Enter the tip percentage: (it should be between 5 and 20)");
            tipRatio = sc.nextInt();
            if (tipRatio>=5 && tipRatio<=20)
                break;
            else
                System.err.println(tipRatio+" is not a valid tip percentage");
        }
        double tip = tipRatio / 100;
       // System.out.println("tip = " + tip);
        double totalTip = tip * billAmount;
      //  System.out.println("totalTip = " + totalTip);
        double totalAmount=totalTip+billAmount;


        if((totalAmount*100)%10==0 || (totalAmount*100)%10==5){
            System.out.println("Total Amount to Pay: "+totalAmount);
            System.out.println("Total Tip to Pay: "+totalTip);
        }
        else {
            if ((totalAmount * 100) % 10 == 1) {
                System.out.println("Total Amount to Pay: " + (totalAmount + 0.04));
                System.out.println("Total Tip to Pay: " + totalTip);
            }
            if ((totalAmount * 100) % 10 == 2) {
                System.out.println("Total Amount to Pay: " +( totalAmount + 0.03));
                System.out.println("Total Tip to Pay: " + totalTip);
            }
            if ((totalAmount * 100) % 10 == 3) {
                System.out.println("Total Amount to Pay: " + (totalAmount + 0.02));
                System.out.println("Total Tip to Pay: " + totalTip);
            }

            if ((totalAmount * 100) % 10 == 4) {
                System.out.println("Total Amount to Pay: " +( totalAmount + 0.01));
                System.out.println("Total Tip to Pay: " + totalTip);
            }
            if ((totalAmount * 100) % 10 == 6) {
                System.out.println("Total Amount to Pay: " + (totalAmount + 0.04));
                System.out.println("Total Tip to Pay: " + totalTip);
            }
            if((totalAmount*100)%10==7){
                System.out.println("Total Amount to Pay: "+(totalAmount+0.03));
                System.out.println("Total Tip to Pay: "+totalTip);
            }
            if((totalAmount*100)%10==8){
                System.out.println("Total Amount to Pay: "+(totalAmount+0.02));
                System.out.println("Total Tip to Pay: "+totalTip);
            }
            if((totalAmount*100)%10==9){
                System.out.println("Total Amount to Pay: "+(totalAmount+0.01));
                System.out.println("Total Tip to Pay: "+totalTip);
            }


        }

    }


}
