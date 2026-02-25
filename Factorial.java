import java.util.Scanner;

public class Factorial {
    int number;
    
    public void setNumber(int n) {
        number = n;
    }
    
    public long calculateFactorial() {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        Factorial f = new Factorial();
        f.setNumber(num);
        
        System.out.println("Factorial: " + f.calculateFactorial());
        scanner.close();
    }
}
