// Scott Jackson
// 5/16/06
// Program In Computing 20A

// Demonstrates inheritance. Keeps track of a time deposit account.
// There is an interest penalty for withdrawing before the time period ends.

public class TimeDepositAccount extends SavingsAccount {
  // Inherits balance from BankAccount, but cannot access it directly.
  private int elapsedPeriods;           // Periods the account has existed
  private int maturityPeriods;          // Periods for account to mature
  private double interestPenaltyRate;   // Rate of interest to be deducted in
                                        //   case of early withdrawl.

  // Constructor to create TimeDepositAccount given interest rate, initial
  // amount, number of periods to maturity, and interest penalty rates.
  public TimeDepositAccount(double rate, double initialAmount, int maturity,
      double penalty) {
    super(rate, initialAmount);
    elapsedPeriods = 0;
    maturityPeriods = maturity;
    interestPenaltyRate = penalty;
  }

  // Inherits methods deposit, getBalance, transfer, and toString methods
  // from BankAccount and addPeriodicInterest from SavingsAccount.

  // Override addPeriodicInterest and withdraw to deal with elapsed periods.

  // Add periodic interest, keeping track of number of elapsed periods.
  public void addPeriodicInterest() {
    elapsedPeriods++;
    super.addPeriodicInterest();
  }

  // Withdraw, but charge a penalty for early withdrawal if necessary.
  public void withdraw(double amount) {
    if (elapsedPeriods < maturityPeriods)
      super.withdraw((interestPenaltyRate / 100) * elapsedPeriods * getBalance());
    super.withdraw(amount);
  }
}
