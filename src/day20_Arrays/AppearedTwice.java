package day20_Arrays;

public class AppearedTwice {
    public static void main(String[] args) {
        char ch[]={'A','A','A','B','C','C','D','D'};
        String com="";
        for (int i = 0; i < ch.length; i++) {
            int count=0;
            for (int i1 = 0; i1 < ch.length; i1++) {
                if(ch[i]==ch[i1])
                    count++;


            }if(count==2 && !com.contains(""+ch[i])){
                com+=ch[i];
                System.out.println(ch[i]);}

        }
    }
}
