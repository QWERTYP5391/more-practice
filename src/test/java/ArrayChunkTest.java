import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

@Ignore
public class ArrayChunkTest {

    @Test
    public void chunk() {
        int[] input = {1, 2, 3, 4};
        int size = 2;
        int[][] expected = {{1, 2}, {3, 4}};


        assertThat(ArrayChunk.chunk(input, size), equalTo(expected));
    }
}