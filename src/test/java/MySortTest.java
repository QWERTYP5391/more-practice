import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class MySortTest {

    @Test
    public void sort() {
        int [] input = {3, 6, 1, 9};
        int [] expected = {1, 3, 6, 9};


        assertThat(MySort.bubbleSort(input), equalTo(expected));
    }

    @Test
    public void mergeSort() {
        int [] input = {3, 6, 1, 9};
        int [] expected = {1, 3, 6, 9};


        assertThat(MySort.mergeSort(input), equalTo(expected));
    }
}