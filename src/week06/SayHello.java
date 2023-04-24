package week06;

import java.util.*;

public class SayHello {
    public static void sayHello(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name= sc.nextLine();
        System.out.println("Welcome "+name);

    }

    public static void characterCount(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str= sc.nextLine();
        System.out.println("The string that you typed is = "+str);
        System.out.println("The number of characters the string contains is = "+str.length());
    }
    public static void printQuotes(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the author:");
        String name= sc.nextLine();
        System.out.println("Enter the quote:");
        String quote= sc.nextLine();
        System.out.println(name+" says, "+"\""+quote+"\".");
    }
    public static void passwordGenerator(){
        String chars="abcdefghijklmnopqrstuvyz";
        String specChars="_-";
        String password="";
        Random random=new Random();
        for (int i = 0; i < 6; i++) {
            password+=chars.charAt(random.nextInt(chars.length()));
        }
        password+=random.nextInt(10);
        password+=specChars.charAt(1);

        String[] split = password.split("");

        int countDigit=0;
        int countSpec=0;
        ArrayList<Character>list=new ArrayList<>();





        for (String each : split) {

            char c=each.charAt(0);
            if(Character.isDigit(c))
                countDigit++;
            if(!Character.isLetterOrDigit(c))
                countSpec++;

        }
        System.out.println("countSpec = " + countSpec);
        System.out.println("countDigit = " + countDigit);
        if(countDigit>=1&&countSpec>=1)
            System.out.println(password+" is valid");
        else
            System.err.println(password+" is not valid");
    }
    public static void phoneNumberValidation(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your phone number:");
        String phone=sc.nextLine();
        ArrayList<Integer> list=new ArrayList<>();
        String[] split = phone.split("");
        for (String each: split){
            try {
                list.add(Integer.parseInt(each));
            }catch (Exception e){

            }
        }
        if(list.size()==10)
            System.out.println(phone+" is valid");
        else
            System.err.println(phone+" is not valid");
    }

    public static void main(String[] args) {
        //sayHello();
        characterCount();
        //printQuotes();
       // passwordGenerator();
     //  phoneNumberValidation();
       // isLetter();
    }
    public static void isLetter(){
        char letter='è';
        boolean a= Character.isLetter(letter);
        System.out.println(a);
    }
}
