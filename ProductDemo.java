import java.util.Scanner;

abstract class Product {
    String productId;
    String productName;
    double price;
    
    Product(String id, String name, double p) {
        productId = id;
        productName = name;
        price = p;
    }
    
    abstract void display();
}

class Book extends Product {
    String author;
    String publisher;
    
    Book(String id, String name, double p, String auth, String pub) {
        super(id, name, p);
        author = auth;
        publisher = pub;
    }
    
    void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: " + price);
    }
}

class CD extends Product {
    String artist;
    int noOfTracks;
    
    CD(String id, String name, double p, String art, int tracks) {
        super(id, name, p);
        artist = art;
        noOfTracks = tracks;
    }
    
    void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Artist: " + artist);
        System.out.println("Number of Tracks: " + noOfTracks);
        System.out.println("Price: " + price);
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== TRAVEL_GUIDE Book ===");
        System.out.print("Enter Product ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Author: ");
        String auth = sc.nextLine();
        System.out.print("Enter Publisher: ");
        String pub = sc.nextLine();
        
        Book book = new Book(id, name, price, auth, pub);
        
        System.out.println("\n=== CD ===");
        System.out.print("Enter Product ID: ");
        id = sc.nextLine();
        System.out.print("Enter Product Name: ");
        name = sc.nextLine();
        System.out.print("Enter Price: ");
        price = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Artist: ");
        String art = sc.nextLine();
        System.out.print("Enter Number of Tracks: ");
        int tracks = sc.nextInt();
        
        CD cd = new CD(id, name, price, art, tracks);
        
        System.out.println("\n=== Book Details ===");
        book.display();
        
        System.out.println("\n=== CD Details ===");
        cd.display();
        
        sc.close();
    }
}