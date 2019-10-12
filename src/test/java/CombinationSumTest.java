import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class CombinationSumTest {

    @Test
    public void combinationSum() {
        List<List<Integer>> combinationSum = CombinationSum.combinationSum(new int[]{2, 3, 6, 7}, 7);

        assertEquals(Arrays.asList(new int[][]{{7}, {2, 2, 3}}), combinationSum);
    }
}