package inheritance10;
//Write a Java program to create a base class BankAccount with methods deposit() and
//withdraw(). Create two subclasses SavingsAccount and CheckingAccount. Override the
//withdraw() method in each subclass to impose different withdrawal limits and fees.

public class SavingsAccount1 extends BankAccount1 {
    public void withdraw(){
        System.out.println("withdraw limit is  £400");
    }

    public static void main(String[] args) {
        SavingsAccount1 s = new SavingsAccount1();
        s.withdraw();
    }
}
