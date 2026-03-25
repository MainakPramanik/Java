import java.util.Scanner;

class BankAccount {
    protected String accountNumber;
    protected double balance;
    
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }
    
    void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }
    
    void displayBalance() {
        System.out.println("Account: " + accountNumber + ", Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    protected double interestRate;
    
    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    
    void addInterest() {
        balance += balance * interestRate / 100;
        System.out.println("Interest added at " + interestRate + "%");
    }
}

class FixedDepositAccount extends SavingsAccount {
    private int maturityPeriod;
    private double initialBalance;
    
    FixedDepositAccount(String accountNumber, double balance, double interestRate, int maturityPeriod) {
        super(accountNumber, balance, interestRate);
        this.maturityPeriod = maturityPeriod;
        this.initialBalance = balance;
    }
    
    double calculateMaturityAmount() {
        return initialBalance * Math.pow(1 + interestRate / 100, maturityPeriod / 12.0);
    }
    
    void displayMaturityDetails() {
        System.out.println("Maturity Period: " + maturityPeriod + " months");
        System.out.println("Maturity Amount: " + calculateMaturityAmount());
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        FixedDepositAccount fda = new FixedDepositAccount("FD001", 10000, 8.5, 24);
        
        fda.displayBalance();
        
        System.out.print("\nEnter amount to deposit: ");
        fda.deposit(sc.nextDouble());
        
        fda.addInterest();
        fda.displayBalance();
        
        System.out.println("\nMaturity Details:");
        fda.displayMaturityDetails();
        
        sc.close();
    }
}
