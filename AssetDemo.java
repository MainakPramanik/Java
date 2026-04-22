import java.util.Scanner;

abstract class Asset {
    String assetName;
    double value;
    
    Asset(String name, double val) {
        assetName = name;
        value = val;
    }
    
    abstract void displayDetails();
}

class Stock extends Asset {
    String companyName;
    int quantity;
    double currentPrice;
    
    Stock(String name, double val, String company, int qty, double price) {
        super(name, val);
        companyName = company;
        quantity = qty;
        currentPrice = price;
    }
    
    void displayDetails() {
        System.out.println("Asset Type: Stock");
        System.out.println("Asset Name: " + assetName);
        System.out.println("Company Name: " + companyName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Current Price: " + currentPrice);
        System.out.println("Total Value: " + (quantity * currentPrice));
    }
}

class Bond extends Asset {
    String issuer;
    double interestRate;
    int maturityYears;
    
    Bond(String name, double val, String issuerName, double rate, int years) {
        super(name, val);
        issuer = issuerName;
        interestRate = rate;
        maturityYears = years;
    }
    
    void displayDetails() {
        System.out.println("Asset Type: Bond");
        System.out.println("Asset Name: " + assetName);
        System.out.println("Issuer: " + issuer);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Maturity Years: " + maturityYears);
        System.out.println("Value: " + value);
    }
}

class Savings extends Asset {
    String bankName;
    double interestRate;
    
    Savings(String name, double val, String bank, double rate) {
        super(name, val);
        bankName = bank;
        interestRate = rate;
    }
    
    void displayDetails() {
        System.out.println("Asset Type: Savings");
        System.out.println("Asset Name: " + assetName);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Current Value: " + value);
    }
}

public class AssetDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Stock ===");
        System.out.print("Enter Stock Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Company Name: ");
        String company = sc.nextLine();
        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();
        System.out.print("Enter Current Price: ");
        double price = sc.nextDouble();
        
        Stock stock = new Stock(name, 0, company, qty, price);
        
        System.out.println("\n=== Bond ===");
        sc.nextLine();
        System.out.print("Enter Bond Name: ");
        name = sc.nextLine();
        System.out.print("Enter Issuer: ");
        String issuer = sc.nextLine();
        System.out.print("Enter Interest Rate (%): ");
        double rate = sc.nextDouble();
        System.out.print("Enter Maturity Years: ");
        int years = sc.nextInt();
        
        Bond bond = new Bond(name, 0, issuer, rate, years);
        
        System.out.println("\n=== Savings ===");
        sc.nextLine();
        System.out.print("Enter Savings Account Name: ");
        name = sc.nextLine();
        System.out.print("Enter Bank Name: ");
        String bank = sc.nextLine();
        System.out.print("Enter Interest Rate (%): ");
        rate = sc.nextDouble();
        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();
        
        Savings savings = new Savings(name, balance, bank, rate);
        
        System.out.println("\n=== Stock Details ===");
        stock.displayDetails();
        
        System.out.println("\n=== Bond Details ===");
        bond.displayDetails();
        
        System.out.println("\n=== Savings Details ===");
        savings.displayDetails();
        
        sc.close();
    }
}