import org.junit.Test;

import static org.junit.Assert.*;

public class PyramidTest {

    @Test
    public void printPyramidWith3() {
        int rows = 3;
        Pyramid.printPyramid(rows);

    }

    @Test
    public void printPyramidWith5() {
        int rows = 5;
        Pyramid.printPyramid(rows);

    }
}