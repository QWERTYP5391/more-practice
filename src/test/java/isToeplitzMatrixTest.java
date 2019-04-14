import org.junit.Test;

import static org.junit.Assert.*;

public class isToeplitzMatrixTest {

    @Test
    public void isToeplitzMatrix() {
        int[][] matrix = {{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}};

        assertTrue(isToeplitzMatrix.isToeplitzMatrix(matrix));

    }

    @Test
    public void isToeplitzMatrix2() {
        int[][] matrix = {{1,2},{2,2}};

        assertFalse(isToeplitzMatrix.isToeplitzMatrix(matrix));

    }
}