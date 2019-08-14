public class Palindrome {

    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }

        if (input.length() <= 1) {
            return true;
        }
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}


