package inheritance10;
//Write a Java program to create a base class BankAccount with methods deposit() and
//withdraw(). Create two subclasses SavingsAccount and CheckingAccount. Override the
//withdraw() method in each subclass to impose different withdrawal limits and fees.

public class BankAccount1 {
    public void deposit(){
        System.out.println("deposit amount £1000 ");
    }
    public void withdraw(){
        System.out.println("withdraw limit is £500");
    }
}
