import java.util.Scanner;

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("(" + x + "," + y + ")");
    }
}

class Circle {
    Point center;
    double radius;

    Circle(int x, int y, double r) {
        center = new Point(x, y);
        radius = r;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    void display() {
        System.out.println("Center Point: ");
        center.display();
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        Circle c = new Circle(x, y, r);
        c.display();
        sc.close();
    }
}
