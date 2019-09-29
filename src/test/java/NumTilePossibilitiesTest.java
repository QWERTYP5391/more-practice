import org.junit.Test;

import static org.junit.Assert.*;

public class NumTilePossibilitiesTest {

    @Test
    public void numTilePossibilities() {
        int result = NumTilePossibilities.numTilePossibilities("AAB");
        assertEquals(result, 8);
    }
}