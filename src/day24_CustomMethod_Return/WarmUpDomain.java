package day24_CustomMethod_Return;

public class WarmUpDomain {
    public static void domain(String email){
        email=email.substring(email.indexOf("@")+1,email.indexOf("."));
        System.out.println(email);
    }

    public static void main(String[] args) {
        String email= "esiyokcaner@gmail.com";
     //   domain(email);
        String[] arr={"agagag@amazon.com","agagah@yahoo.com","unubhjag@cydeo.com"};
        for (String s : arr) {
            domain(s);
        }
    }
}
