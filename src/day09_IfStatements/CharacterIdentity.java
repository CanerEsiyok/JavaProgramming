package day09_IfStatements;

public class CharacterIdentity {
    public static void main(String[] args) {
    char ch='3';
    if(ch>='0'&&ch<='9')
        System.out.println("Digit");
    else if (ch>='A'&&ch<='Z')
        System.out.println("Alphabetic");
    else
        System.out.println("Special character");
    }
}
