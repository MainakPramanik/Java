import java.util.Scanner;

class Item {
    int code;
    double price;

    void accept(int c, double p) {
        code = c;
        price = p;
    }

    void display() {
        System.out.printf("%-10d %-10.2f%n", code, price);
    }
}

public class ItemDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item[] items = new Item[5];
        double total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for item " + (i + 1) + ":");
            System.out.print("Code: ");
            int code = sc.nextInt();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            items[i] = new Item();
            items[i].accept(code, price);
            total += price;
        }

        System.out.println("\n" + "-".repeat(25));
        System.out.printf("%-10s %-10s%n", "Code", "Price");
        System.out.println("-".repeat(25));
        for (Item item : items) {
            item.display();
        }
        System.out.println("-".repeat(25));
        System.out.printf("Total Price: %.2f%n", total);
        sc.close();
    }
}
