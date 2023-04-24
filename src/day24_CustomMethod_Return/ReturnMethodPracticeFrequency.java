package day24_CustomMethod_Return;

public class ReturnMethodPracticeFrequency {
    public static int frequency(String str,char ch){
        int count=0;
        for(char each: str.toCharArray()){
            if(each==ch)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String str="aabccdee";

        for (int i = 0; i <str.length() ; i++) {
            int frq=frequency(str,str.charAt(i));
            if(frq==1)
                System.out.println(str.charAt(i)+" is a unique character");
        }

    }

}
