public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "noon";

        char[] stack = new char[input.length()];
        int top = -1;

        for (int i = 0; i < input.length(); i++) {
            stack[++top] = input.charAt(i);
        }

        boolean isPalindrome = true;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack[top--]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }
    }
}