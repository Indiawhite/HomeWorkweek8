package inheritance3;
//Write a Java program to create a class known as "BankAccount" with methods called
//deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the
//withdraw() method to prevent withdrawals if the account balance falls below one
//hundred.

public class BankAccount {
    public void deposit()
    {System.out.println("£1000 is  my balance");
    }

    public void withdraw(){
        System.out.println("£500 withdraw from my account");
    }
}
