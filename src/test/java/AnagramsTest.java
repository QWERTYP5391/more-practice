import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramsTest {

    @Test
    public void isAnagram() {
        String input = "rail safety";
        String input2 = "fairy tales";

        assertTrue(Anagrams.isAnagram(input, input2));
    }

    @Test
    public void isAnagramHello() {
        String input = "hello";
        String input2 = "hellos";

        assertFalse(Anagrams.isAnagram(input, input2));
    }
}