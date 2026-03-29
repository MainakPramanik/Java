import java.util.Scanner;

public class CaseConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String upper = str.toUpperCase();
        String lower = str.toLowerCase();
        String swapped = "";

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) swapped += Character.toLowerCase(ch);
            else if (Character.isLowerCase(ch)) swapped += Character.toUpperCase(ch);
            else swapped += ch;
        }

        System.out.println("Original: " + str);
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        System.out.println("Swapped: " + swapped);
        sc.close();
    }
}
