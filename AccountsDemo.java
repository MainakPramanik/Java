import java.util.Scanner;

abstract class Accounts {
    double balance;
    int accountNumber;
    String accountHoldersName;
    String address;
    
    Accounts(int accNo, String name, String addr, double bal) {
        accountNumber = accNo;
        accountHoldersName = name;
        address = addr;
        balance = bal;
    }
    
    abstract void withdrawal(double amount);
    abstract void deposit(double amount);
    
    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHoldersName);
        System.out.println("Address: " + address);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Accounts {
    double rateOfInterest;
    
    SavingsAccount(int accNo, String name, String addr, double bal, double rate) {
        super(accNo, name, addr, bal);
        rateOfInterest = rate;
    }
    
    void withdrawal(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
    
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    
    void calculateAmount() {
        double interest = balance * rateOfInterest / 100;
        balance += interest;
        System.out.println("Interest earned: " + interest);
        System.out.println("Updated balance with interest: " + balance);
    }
    
    @Override
    void display() {
        super.display();
        System.out.println("Rate of Interest: " + rateOfInterest + "%");
    }
}

public class AccountsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Address: ");
        String addr = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();
        System.out.print("Enter Rate of Interest (%): ");
        double rate = sc.nextDouble();
        
        SavingsAccount sa = new SavingsAccount(accNo, name, addr, bal, rate);
        
        System.out.println("\n=== Account Details ===");
        sa.display();
        
        System.out.print("\nEnter amount to deposit: ");
        sa.deposit(sc.nextDouble());
        sa.display();
        
        System.out.print("\nEnter amount to withdraw: ");
        sa.withdrawal(sc.nextDouble());
        sa.display();
        
        System.out.println("\n=== After Interest Calculation ===");
        sa.calculateAmount();
        
        sc.close();
    }
}