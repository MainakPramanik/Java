import java.util.Scanner;

public class ReplaceChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = str.replace('d', 'f');
        System.out.println("Original: " + str);
        System.out.println("Modified: " + result);
        sc.close();
    }
}
