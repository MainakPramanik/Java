import java.util.Scanner;

abstract class MotorVehicle {
    String modelName;
    String modelNumber;
    double modelPrice;
    
    MotorVehicle(String name, String number, double price) {
        modelName = name;
        modelNumber = number;
        modelPrice = price;
    }
    
    abstract void display();
}

class Car extends MotorVehicle {
    double discountRate;
    
    Car(String name, String number, double price, double discount) {
        super(name, number, price);
        discountRate = discount;
    }
    
    void display() {
        System.out.println("Car Name: " + modelName);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Price: " + modelPrice);
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Discount Amount: " + discount());
    }
    
    double discount() {
        return modelPrice * discountRate / 100;
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Car Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Model Number: ");
        String number = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Discount Rate (%): ");
        double discount = sc.nextDouble();
        
        Car car = new Car(name, number, price, discount);
        
        System.out.println("\n=== Car Details ===");
        car.display();
        
        sc.close();
    }
}