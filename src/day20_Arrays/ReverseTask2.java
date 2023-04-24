package day20_Arrays;

public class ReverseTask2 {
    public static void main(String[] args) {
        String names[]={"Java","Python","Laptop"};

        for (int i = 0; i < names.length; i++) {
            String reverse="";
            for (int j = names[i].length()-1; j>=0; j--) {
                reverse+=""+names[i].charAt(j);

            }
            System.out.println(reverse);
        }
    }
}
