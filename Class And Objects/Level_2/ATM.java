package Level_2;

class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount; 
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) { 
            this.balance -= amount; 
        } else {
            System.out.println("Insufficient Balance"); 
        }
    }

    public void display() {
        System.out.println("\n===== Account Details =====");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

public class ATM {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("kriti", 101, 6000);
        BankAccount a2 = new BankAccount("kritika", 102, 5000);

        a1.display();

        a1.deposit(6000);
        a1.display();

        a1.withdraw(5000);
        a1.display();

        a2.display();

        a2.withdraw(5000);
        a2.display(); 

        a2.deposit(327948);
        a2.display(); 
    }
}
