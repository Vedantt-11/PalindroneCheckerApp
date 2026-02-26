import java.util.Scanner;

public class ArrayBasedChecking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String input = sc.nextLine();

        // Convert string to character array
        char[] chars = input.toCharArray();
        boolean isPalindrome = true;

        // Two-pointer approach
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }

        sc.close();
    }
}