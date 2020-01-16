import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class MinimumHoursTest {
    @Before
    public void setUp() throws Exception {
        MinimumHours.fileCount = 0;
    }

    @Test
    public void minimumHours() {
        List<Integer> rowOne = new ArrayList<>();
        rowOne.add(0);
        rowOne.add(1);
        rowOne.add(1);
        rowOne.add(0);
        rowOne.add(1);

        List<Integer> rowTwo = new ArrayList<>();
        rowTwo.add(0);
        rowTwo.add(1);
        rowTwo.add(0);
        rowTwo.add(1);
        rowTwo.add(1);

        List<Integer> rowThree = new ArrayList<>();
        rowThree.add(0);
        rowThree.add(0);
        rowThree.add(0);
        rowThree.add(0);
        rowThree.add(1);

        List<Integer> rowFour = new ArrayList<>();
        rowFour.add(0);
        rowFour.add(1);
        rowFour.add(0);
        rowFour.add(0);
        rowFour.add(0);

        List<List<Integer>> grid = new ArrayList<>();
        grid.add(rowOne);
        grid.add(rowTwo);
        grid.add(rowThree);
        grid.add(rowFour);
        int hours = MinimumHours.minimumHours(4, 5, grid);
        assertThat(hours, equalTo(2));
    }
}

