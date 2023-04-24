package day26_CustomMethodPractice;

public class FrequencyOfElements {
    public static int frequencyOfElement(int[] list,int n){
        int count=0;
        for (int i : list) {
            if(i==n)
                count++;
        }
        return count;
    }
    public static int frequencyOfElement(double[] list,double n){
        int count=0;
        for (double i : list) {
            if(i==n)
                count++;
        }
        return count;
    }
    public static int frequencyOfElement(char[] list,char n){
        int count=0;
        for (char i : list) {
            if(i==n)
                count++;
        }
        return count;
    }
    public static int frequencyOfElement(String[] list,String n){
        int count=0;
        for (String i : list) {
            if(i.equalsIgnoreCase(n))
                count++;
        }
        return count;
    }


}
