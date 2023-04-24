package day35_Encapsulation;

public class BankAccountObject {
    public static void main(String[] args) {
        BankAccount account1=new BankAccount("Caner Esiyok",1453);
        System.out.println(account1);
        account1.deposit(1200);
        account1.deposit(1500);
        System.out.println(account1);
        account1.withdraw(700);
        account1.checkBalance();

    }
}
