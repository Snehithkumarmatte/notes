// Base class Account
class Account {
    protected String customerName;
    protected String accountNumber;
    protected String accountType;
    protected double balance;

    // Method to initialize account details
    public void initializeAccount(String name, String accNumber, String accType) {
        this.customerName = name;
        this.accountNumber = accNumber;
        this.accountType = accType;
        this.balance = 0.0;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
}

// Derived class for Savings Account
class SavAcct extends Account {
    private final double interestRate = 0.04;  // 4% interest rate

    // Method to compute and deposit interest
    public void computeInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest of " + interest + " added. New balance: " + balance);
    }

    // Method to withdraw money from the savings account
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }
}

// Derived class for Current Account
class CurrAcct extends Account {
    private final double minimumBalance = 1000.0;  // Minimum balance requirement
    private final double serviceCharge = 100.0;    // Penalty charge if below minimum balance

    // Method to check and impose penalty if balance falls below minimum
    public void checkMinimumBalance() {
        if (balance < minimumBalance) {
            balance -= serviceCharge;
            System.out.println("Balance below minimum! Service charge of " + serviceCharge + " imposed. New balance: " + balance);
        } else {
            System.out.println("Balance is sufficient. No penalty imposed.");
        }
    }

    // Method to withdraw money from the current account
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
            checkMinimumBalance();  // Check for penalty after withdrawal
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }
}

// Main class to demonstrate the functionality
public class BankSystem {
    public static void main(String[] args) {
        // Creating a savings account
        SavAcct savingsAccount = new SavAcct();
        savingsAccount.initializeAccount("John Doe", "SA123", "Savings");
        savingsAccount.deposit(5000);
        savingsAccount.computeInterest();
        savingsAccount.withdraw(2000);
        savingsAccount.displayBalance();

        // Creating a current account
        CurrAcct currentAccount = new CurrAcct();
        currentAccount.initializeAccount("Jane Smith", "CA123", "Current");
        currentAccount.deposit(1500);
        currentAccount.withdraw(600);
        currentAccount.checkMinimumBalance();
        currentAccount.displayBalance();
    }
}
