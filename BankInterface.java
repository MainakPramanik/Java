import java.util.Scanner;

interface Bank {
    void displayBankInfo();
}

class Customer {
    private String customerName;
    private String customerId;

    Customer(String name, String id) {
        this.customerName = name;
        this.customerId = id;
    }

    void displayCustomer() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer ID: " + customerId);
    }
}

class Account extends Customer implements Bank {
    private int accountNumber;
    private double balance;
    private String accountType;

    Account(String name, String id, int accNo, double bal, String type) {
        super(name, id);
        this.accountNumber = accNo;
        this.balance = bal;
        this.accountType = type;
    }

    public void displayBankInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: Rs." + balance);
    }

    void displayAll() {
        System.out.println("\n===== Account Details =====");
        displayCustomer();
        displayBankInfo();
    }
}

public class BankInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Customer ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        System.out.print("Enter Balance: ");
        double bal = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Account Type (Savings/Current): ");
        String type = sc.nextLine();

        Account acc = new Account(name, id, accNo, bal, type);
        acc.displayAll();
        sc.close();
    }
}
