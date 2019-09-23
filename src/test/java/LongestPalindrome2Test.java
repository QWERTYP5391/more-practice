import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindrome2Test {

    @Test
    public void longestPalindrome() {
        String longestPalindrome = LongestPalindrome2.longestPalindrome("bb");
        assertEquals(longestPalindrome, "bb");
    }
}