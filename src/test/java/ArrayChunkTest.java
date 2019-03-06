import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class ArrayChunkTest {

    @Test
    public void chunk1234Size2() {
        int[] input = {1, 2, 3, 4};
        int size = 2;
        int[][] expected = {{1, 2}, {3, 4}};


        assertThat(ArrayChunk.chunk(input, size), equalTo(expected));
    }

    @Test
    public void chunk12345Size2() {
        int[] input = {1, 2, 3, 4, 5};
        int size = 2;
        int[][] expected = {{1, 2}, {3, 4}, {5}};


        assertThat(ArrayChunk.chunk(input, size), equalTo(expected));
    }

    @Test
    public void chunk123456Size2() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int size = 2;
        int[][] expected = {{1, 2}, {3, 4}, {5, 6}};


        assertThat(ArrayChunk.chunk(input, size), equalTo(expected));
    }

    @Test
    public void chunk123456Size3() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int size = 3;
        int[][] expected = {{1, 2, 3}, {4, 5, 6}};


        assertThat(ArrayChunk.chunk(input, size), equalTo(expected));
    }

    @Test
    public void chunk12345678Size3() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        int size = 3;
        int[][] expected = {{1, 2, 3}, {4, 5, 6}, {7, 8}};


        assertThat(ArrayChunk.chunk(input, size), equalTo(expected));
    }


}