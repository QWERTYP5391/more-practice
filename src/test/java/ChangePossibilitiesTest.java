import org.junit.Test;

import static org.junit.Assert.*;

public class ChangePossibilitiesTest {

    @Test
    public void sampleInputTest() {
        final int actual = ChangePossibilities.changePossibilities(4, new int[] {1, 2, 3});
        final int expected = 4;
        assertEquals(expected, actual);
    }
}