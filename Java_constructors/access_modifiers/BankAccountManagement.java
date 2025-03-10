package access_modifiers;

class BankAccount {
    public String accountNumber; 
    protected String accountHolder; 
    private double balance; 

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber; 
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsAccountInfo() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber); 
        System.out.println("Account Holder: " + accountHolder); 
        System.out.println("Balance: " + getBalance()); 
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount acc1 = new BankAccount("123456789", "Rithik", 5000);
        acc1.displayAccountInfo();

        acc1.deposit(5000);
        acc1.withdraw(2000);
        System.out.println("Updated Balance:" + acc1.getBalance());

        SavingsAccount savAcc = new SavingsAccount("987654321", "SHEKHAWAT", 10000, 3.5);
        savAcc.displaySavingsAccountInfo();
    }
}
