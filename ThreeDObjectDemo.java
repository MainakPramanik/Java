import java.util.Scanner;

abstract class ThreeDObject {
    abstract double wholeSurfaceArea();
    abstract double volume();
}

class Box extends ThreeDObject {
    double length, width, height;
    
    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }
    
    double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }
    
    double volume() {
        return length * width * height;
    }
}

class Cube extends ThreeDObject {
    double side;
    
    Cube(double s) {
        side = s;
    }
    
    double wholeSurfaceArea() {
        return 6 * side * side;
    }
    
    double volume() {
        return side * side * side;
    }
}

class Cylinder extends ThreeDObject {
    double radius, height;
    
    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }
    
    double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
    
    double volume() {
        return Math.PI * radius * radius * height;
    }
}

class Cone extends ThreeDObject {
    double radius, height;
    
    Cone(double r, double h) {
        radius = r;
        height = h;
    }
    
    double wholeSurfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }
    
    double volume() {
        return Math.PI * radius * radius * height / 3;
    }
}

public class ThreeDObjectDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThreeDObject obj;
        
        System.out.println("=== Box ===");
        System.out.print("Enter length, width, height: ");
        obj = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("Surface Area: " + obj.wholeSurfaceArea());
        System.out.println("Volume: " + obj.volume());
        
        System.out.println("\n=== Cube ===");
        System.out.print("Enter side: ");
        obj = new Cube(sc.nextDouble());
        System.out.println("Surface Area: " + obj.wholeSurfaceArea());
        System.out.println("Volume: " + obj.volume());
        
        System.out.println("\n=== Cylinder ===");
        System.out.print("Enter radius, height: ");
        obj = new Cylinder(sc.nextDouble(), sc.nextDouble());
        System.out.println("Surface Area: " + obj.wholeSurfaceArea());
        System.out.println("Volume: " + obj.volume());
        
        System.out.println("\n=== Cone ===");
        System.out.print("Enter radius, height: ");
        obj = new Cone(sc.nextDouble(), sc.nextDouble());
        System.out.println("Surface Area: " + obj.wholeSurfaceArea());
        System.out.println("Volume: " + obj.volume());
        
        sc.close();
    }
}