import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class RecursiveStringPermutationTest {
    @Before
    public void setUp() {
        RecursiveStringPermutation.set = new HashSet<>();
    }

    @Test
    public void emptyStringTest() {
        Set<String> expected = new HashSet<>(Collections.singletonList(""));
        Set<String> actual = RecursiveStringPermutation.getPermutations("");
        assertEquals(expected, actual);
    }

    @Test
    public void oneCharacterStringTest() {
        final Set<String> expected = new HashSet<>(Collections.singletonList("a"));
        final Set<String> actual = RecursiveStringPermutation.getPermutations("a");
        assertEquals(expected, actual);
    }

    @Test
    public void twoCharacterStringTest() {
        final Set<String> expected = new HashSet<>(Arrays.asList("ab", "ba"));
        final Set<String> actual = RecursiveStringPermutation.getPermutations("ab");
        assertEquals(expected, actual);
    }

    @Test
    public void threeCharacterStringTest() {
        final Set<String> expected = new HashSet<>(Arrays.asList("abc", "acb", "bac", "bca",
                "cab", "cba"));
        final Set<String> actual = RecursiveStringPermutation.getPermutations("abc");
        assertEquals(expected, actual);
    }

}