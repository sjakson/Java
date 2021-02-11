// Scott Jackson
// 5/16/06
// Program In Computing 20A

// Demonstrates inheritance. Keeps track of a checking account.

// A checking account is a bank account that has transaction charges for
// all transactions above a minimum number.

public class CheckingAccount extends BankAccount {
  // Note that balance is inherited, but not directly accessible.
  private static final int FREE_TRANSACTIONS = 3;
  private static final double TRANSACTION_FEE = 0.50;
  private int transactionCount; // Number of transactions this period

  // Default constructor to create 0-balance account.
  public CheckingAccount() {
    transactionCount = 0;
  }

  // Constructor to create an account with intial balance initialAmount.
  public CheckingAccount(double initialAmount) {
    super(initialAmount);
    transactionCount = 0;
  }

  // Methods getBalance, transfer, and toString are inherited.
  // Methods withdraw and deposit from the superclass fail to take into
  // account transaction counts, and so they need to be overridden.

  // Withdraw amount from account, but count as a transaction.
  public void withdraw(double amount) {
    super.withdraw(amount);
    transactionCount++;
  }

  // Deposit amount to account, but count as a transaction.
  public void deposit(double amount) {
    super.deposit(amount);
    transactionCount++;
  }

  // Charge transaction fees (if any) to the account
  public void deductFees() {
    if (transactionCount > FREE_TRANSACTIONS) {
      double fee = TRANSACTION_FEE * (transactionCount - FREE_TRANSACTIONS);
      super.withdraw(fee);
    }
    transactionCount = 0; // Start over because new time period.
  }
}