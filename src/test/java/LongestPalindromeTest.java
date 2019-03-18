import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class LongestPalindromeTest {

    @Test
    public void longestPalindromeWithbabad() {
        String input = "babad";

        String expected = "bab";

        assertThat(LongestPalindrome.longestPalindrome(input), equalTo(expected));
    }

    @Test
    public void longestPalindromeWithcbbd() {
        String input = "cbbd";

        String expected = "bb";

        assertThat(LongestPalindrome.longestPalindrome(input), equalTo(expected));
    }

    @Test
    public void longestPalindromeWithcbb() {
        String input = "bb";

        String expected = "bb";

        assertThat(LongestPalindrome.longestPalindrome(input), equalTo(expected));
    }


    @Test
    public void longestPalindromeWithabcda() {
        String input = "abcda";

        String expected = "a";

        assertThat(LongestPalindrome.longestPalindrome(input), equalTo(expected));
    }


    @Test
    public void longestPalindromeWithabacab() {
        String input = "abacab";

        String expected = "bacab";

        assertThat(LongestPalindrome.longestPalindrome(input), equalTo(expected));
    }


    @Test
    public void longestPalindromeWithaaabaaa() {
        String input = "aaabaaa";

        String expected = "aaabaaa";

        assertThat(LongestPalindrome.longestPalindrome(input), equalTo(expected));
    }

    @Test
    public void longestPalindromeWithaaabaaaa() {
        String input = "aaabaaaa";

        String expected = "aaabaaa";

        assertThat(LongestPalindrome.longestPalindrome(input), equalTo(expected));
    }


    @Test
    public void longestPalindromeWithbabadada() {
        String input = "babadada";

        String expected = "adada";

        assertThat(LongestPalindrome.longestPalindrome(input), equalTo(expected));
    }


}