package day14_String;

public class EmailDomain {
    public static void main(String[] args) {
        String email="esiyokcaner@gmail.com";
        String domain=email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println(domain);

        String str="Java is fun, Java is cool";
        String first=str.substring(0,str.indexOf(","));
        System.out.println(first);
        String second=str.substring(str.lastIndexOf("J"));
        System.out.println(second);
    }
}
