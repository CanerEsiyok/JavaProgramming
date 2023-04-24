package day24_CustomMethod_Return;

public class ReturnMethodPractice2 {
    public static String grade(int score) {
        String result = "";
        if (score < 0 || score > 100)
            result = "Invalid";
        else {
            result = score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : score >= 60 ? "D" : "F";
        }
        return result;

    }

    public static void note(String a) {
        if (a.equals("A"))
            System.out.println("Excellent");
        else if (a.equals("B"))
            System.out.println("Great");
        else if (a.equals("C"))
            System.out.println("Good");
        else if (a.equals("D"))
            System.out.println("Passed");
        else System.out.println("Failed");
    }



    public static void main(String[] args) {
     int score=75;
     String ch=grade(score);
     note(ch);
    }
}
