import java.util.Scanner;

public class StringStats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int upper = 0, lower = 0, digits = 0, spaces = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) upper++;
            else if (Character.isLowerCase(ch)) lower++;
            else if (Character.isDigit(ch)) digits++;
            else if (ch == ' ') spaces++;
        }

        System.out.println("Uppercase characters: " + upper);
        System.out.println("Lowercase characters: " + lower);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
        sc.close();
    }
}
