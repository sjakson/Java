// Scott Jackson
// 5/16/06
// Program In Computing 20A


// Tests the various bank account classes.

public class AccountTest {
  public static void main(String[] args) {
    SavingsAccount momsSavings = new SavingsAccount(0.5);
    TimeDepositAccount collegeFund = new TimeDepositAccount(1.0, 10000.00, 3, 0.5);
    CheckingAccount scottsChecking = new CheckingAccount();

    momsSavings.deposit(10000.00);

    momsSavings.transfer(scottsChecking, 2000);

    scottsChecking.withdraw(200);
    scottsChecking.withdraw(300);
    scottsChecking.withdraw(80);
    scottsChecking.withdraw(400);

    endOfMonth(momsSavings);
    endOfMonth(collegeFund);
    endOfMonth(scottsChecking);

    collegeFund.transfer(scottsChecking, 980);

    System.out.println("Mom's savings. " + momsSavings);
    // (10000 - 2000) * .5 % interest = 8040
    System.out.println("The college fund. " + collegeFund);
    // (10000 * 1% interest) * 0.5% penalty - 980 = 9069.50
    System.out.println("scott's checking. " + scottsChecking);
    // 2000 - 200 - 300 - 80 - 400 - 2 trans. fees + 980 = 1999
  }

  // Handles end-of-month operations. Overloaded method, because
  // checking account does different things than savings account.

  public static void endOfMonth(SavingsAccount savings) {
    savings.addPeriodicInterest();
  }

  public static void endOfMonth(CheckingAccount checking) {
    checking.deductFees();
  }
}