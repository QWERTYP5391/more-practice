import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void testIsPalindromeAbba() {
        String input = "abba";
        assertTrue(Palindrome.isPalindrome(input));
    }

    @Test
    public void testIsPalindromeAbcdefg() {
        String input = "abcdefg";
        assertFalse(Palindrome.isPalindrome(input));
    }

    @Test
    public void testIsPalindromeNull() {
        assertFalse(Palindrome.isPalindrome(null));
    }

    @Test
    public void testIsPalindromeEmptyString() {
        String input = "";
        assertTrue(Palindrome.isPalindrome(input));
    }

}