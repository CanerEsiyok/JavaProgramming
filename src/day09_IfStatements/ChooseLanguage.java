package day09_IfStatements;
import java.util.*;

public class ChooseLanguage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number between 1-5");
        int a= sc.nextInt();
        if (a==1){
            System.out.println("Hello, thank for your call");
        } else if (a==2) {
            System.out.println("Hola, gracias para llamar");

        } else if (a==3) {
            System.out.println("Merhaba, aradiginiz icin tesekkurler");

        } else if (a==4) {
            System.out.println("Privet, spasibo za vash zvonok");

        } else if (a==5) {
            System.out.println("Merci ,pour votre appel");

        }else {
            System.out.println("Invalid number");


    }
}}
