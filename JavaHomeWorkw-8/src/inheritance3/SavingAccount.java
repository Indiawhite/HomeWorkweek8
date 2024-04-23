package inheritance3;
//Write a Java program to create a class known as "BankAccount" with methods called
//deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the
//withdraw() method to prevent withdrawals if the account balance falls below one
//hundred.

public class SavingAccount extends BankAccount {
          public void withdraw(){
              System.out.println("£600 withdraw from my account");
          }

    public static void main(String[] args) {
        SavingAccount s = new SavingAccount();
        s.withdraw();
    }
}
