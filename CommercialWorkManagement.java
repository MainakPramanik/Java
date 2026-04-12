interface SalesDepartment {
    void processSale(double amount);
}

interface FinanceDepartment {
    void generateInvoice(String clientName, double amount);
}

class CommercialExecutive implements SalesDepartment, FinanceDepartment {
    private double totalSales;
    private int saleCount;
    private int invoiceCount;

    CommercialExecutive() {
        totalSales = 0;
        saleCount = 0;
        invoiceCount = 0;
    }

    public void processSale(double amount) {
        System.out.println("Processing sale...");
        System.out.println("Sale Amount: Rs." + amount);
        System.out.println("Sale Confirmed!");
        totalSales += amount;
        saleCount++;
    }

    public void generateInvoice(String clientName, double amount) {
        System.out.println("\nGenerating Invoice...");
        System.out.println("Client Name: " + clientName);
        System.out.println("Invoice Amount: Rs." + amount);
        System.out.println("Invoice Generated Successfully!");
        invoiceCount++;
    }

    void showSummary() {
        System.out.println("\n===== Commercial Operations Summary =====");
        System.out.println("Total Sales Completed: " + saleCount);
        System.out.println("Total Revenue: Rs." + totalSales);
        System.out.println("Invoices Generated: " + invoiceCount);
        System.out.println("===========================================");
    }

    public static void main(String[] args) {
        CommercialExecutive exec = new CommercialExecutive();

        exec.processSale(50000);
        exec.generateInvoice("ABC Corp", 25000);
        exec.processSale(75000);
        exec.generateInvoice("XYZ Ltd", 30000);
        exec.showSummary();
    }
}
