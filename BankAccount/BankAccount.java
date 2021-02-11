// Scott Jackson
// 5/16/06
// Program In Computing 20A

// This class--along with SavingsAccount, CheckingAccount, and
// TimeDepositAccount--demonstrates inheritance. Keeps track of a bank account.

public class BankAccount {
  private double balance; // Hold the amount in the account

  // Default constructor. Creates an account with 0 balance.
  public BankAccount() {
    balance = 0.00;
  }

  // Constructor. Creates an account with balance equal to initialAmount.
  public BankAccount(double initialAmount) {
    balance = initialAmount;
  }

  // Deposits amount into the bank account.
  public void deposit(double amount) {
    balance += amount;
  }

  // Withdraws amount from the bank account.
  // Limitation: Does not test for an overdrawn account.
  public void withdraw(double amount) {
    balance -= amount;
  }

  // Returns the current balance in the account.
  public double getBalance() {
    return balance;
  }

  // Transfers amount from this bank account to other.
  public void transfer(BankAccount other, double amount) {
    withdraw(amount);
    other.deposit(amount);
  }

  // Overrides the toString provided by the Object class.
  public String toString() {
    return "Account balance: " + balance;
  }
}