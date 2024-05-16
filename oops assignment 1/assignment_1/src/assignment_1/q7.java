package assignment_1;
abstract class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}

// Subclass SavingsAccount
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        super.setBalance(super.getBalance() + amount);
        double interest = amount * interestRate / 100;
        super.setBalance(super.getBalance() + interest);
    }

    @Override
    public void withdraw(double amount) {
        if (super.getBalance() >= amount) {
            super.setBalance(super.getBalance() - amount);
        } else {
            System.out.println("Insufficient balance for withdrawal");
        }
    }
}

// Subclass CurrentAccount
class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (super.getBalance() + overdraftLimit >= amount) {
            super.setBalance(super.getBalance() - amount);
        } else {
            super.setBalance(super.getBalance() - overdraftLimit);
            System.out.println("Overdraft limit exceeded");
        }
    }
}

public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount savingsAccount = new SavingsAccount(1, 1000.0, 5.0);
        CurrentAccount currentAccount = new CurrentAccount(2, 500.0, 500.0);

        // Deposit and withdraw operations
        savingsAccount.deposit(500.0);
        savingsAccount.withdraw(200.0);

        currentAccount.deposit(1000.0);
        currentAccount.withdraw(1500.0);

        // Display account details
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + savingsAccount.getAccountNumber());
        System.out.println("Balance: " + savingsAccount.getBalance());
        System.out.println();

        System.out.println("Current Account Details:");
        System.out.println("Account Number: " + currentAccount.getAccountNumber());
        System.out.println("Balance: " + currentAccount.getBalance());

	}

}
