import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class CombinationSumTest {

    @Test
    public void combinationSum() {
        List<List<Integer>> combinationSum = CombinationSum.combinationSum(new int[]{2, 3, 6, 7}, 7);

        assertEquals(Arrays.asList(Arrays.asList(2,2,3), Collections.singletonList(7)), combinationSum);
    }
}