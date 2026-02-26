import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to check: ");
        String original = sc.nextLine();

        String reversed = "";

        // Reverse the string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i); // String concatenation
        }

        // Compare original and reversed strings
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }

        sc.close();
    }
}