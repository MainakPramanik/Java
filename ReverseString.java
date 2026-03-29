public class ReverseString {
    public static void main(String[] args) {
        String str = "This is a test";
        String[] words = str.split(" ");
        String reversed = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i] + " ";
        }

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed.trim());
    }
}
