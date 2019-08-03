public class LongestPalindrome {

    private LongestPalindrome() {

    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        String longestPalindrome = s.substring(0, 1);

        for (int front = 0; front < s.length() - 1; front++) {
            int back = s.length() - 1;
            while (back >= 1 && front < back) {
                if (s.charAt(front) != s.charAt(back)) {
                    back--;
                } else {
                    String subString = s.substring(front, back + 1);
                    String reducedSubString = subString.substring(1, subString.length() - 1);
                    if (subString.length() > longestPalindrome.length() && Palindrome.isPalindrome(reducedSubString)) {
                        longestPalindrome = subString;
                        break;
                    } else {
                        back--;
                    }
                }

            }
        }


        return longestPalindrome;
    }

}