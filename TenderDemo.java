import java.util.Scanner;

class Tender {
    double cost;
    String companyName;

    void accept(double c, String name) {
        cost = c;
        companyName = name;
    }
}

public class TenderDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tender[] tenders = new Tender[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for tender " + (i + 1) + ":");
            System.out.print("Cost: ");
            double cost = sc.nextDouble();
            System.out.print("Company Name: ");
            String name = sc.next();
            tenders[i] = new Tender();
            tenders[i].accept(cost, name);
        }

        int minIndex = 0;
        for (int i = 1; i < 5; i++) {
            if (tenders[i].cost < tenders[minIndex].cost) {
                minIndex = i;
            }
        }

        System.out.println("\nCompany with minimum cost: " + tenders[minIndex].companyName);
        sc.close();
    }
}
