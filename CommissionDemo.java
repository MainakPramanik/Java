import java.util.Scanner;

class Commission {
    private double sales;
    
    Commission(double sales) {
        this.sales = sales;
    }
    
    double commission() {
        if (sales <= 0) return 0;
        if (sales <= 10000) return sales * 0.10;
        if (sales <= 20000) return sales * 0.15;
        return sales * 0.20;
    }
    
    double getSales() {
        return sales;
    }
}

public class CommissionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sales amount: ");
        double sales = sc.nextDouble();
        
        if (sales < 0) {
            System.out.println("Invalid Input");
        } else {
            Commission comm = new Commission(sales);
            System.out.println("Sales: " + comm.getSales());
            System.out.println("Commission: " + comm.commission());
        }
        sc.close();
    }
}
