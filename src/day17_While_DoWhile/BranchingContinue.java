package day17_While_DoWhile;

public class BranchingContinue {
    public static void main(String[] args) {
        for (char i = 'A'; i < 'E'; i++) {
            if(i=='C')
                continue;
            System.out.print(i+" ");


        }
        System.out.println();

        for (int i = 1; i <11 ; i++) {
            if(i%2!=0)
                continue;
            System.out.print(i+" ");

        }System.out.println();

        for (int i = 1; i <11 ; i++) {
            if(i%2==0)
                continue;
            System.out.print(i+" ");
    }
} }
