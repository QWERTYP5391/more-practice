import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class RemoveStonesTest {

    @Test
    @Ignore
    public void removeStones() {
        int[][] input = {{0, 0}, {0, 1}, {1, 0}, {1, 2}, {2, 1}, {2, 2}};
        int result = RemoveStones.removeStones(input);

        assertThat(result, equalTo(5));
    }
}