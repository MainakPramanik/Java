import java.util.Scanner;

class AreaCalculator {
    double area(double radius) {
        return Math.PI * radius * radius;
    }

    double area(double length, double breadth) {
        return length * breadth;
    }

    double area(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

public class AreaOverload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculator calc = new AreaCalculator();

        System.out.println("Circle area (radius 5): " + calc.area(5));
        System.out.println("Rectangle area (5 x 3): " + calc.area(5, 3));
        System.out.println("Triangle area (3, 4, 5): " + calc.area(3, 4, 5));

        sc.close();
    }
}
