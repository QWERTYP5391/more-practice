// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED

import java.util.List;

// CLASS BEGINS, THIS CLASS IS REQUIRED
public class NumberAmazonTreasureTrucks {
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    int numberAmazonTreasureTrucks(int rows, int column,
                                   List<List<Integer>> grid) {
        // WRITE YOUR CODE HERE
        if (grid == null || grid.size() == 0) {
            return 0;
        }

        int result = 0;
        for (int row = 0; row < rows; ++row) {
            for (int c = 0; c < column; ++c) {
                if (grid.get(row).get(c) == 1) {
                    ++result;
                    dfs(grid, row, c, rows, column);
                }
            }
        }

        return result;

    }

    void dfs(List<List<Integer>> grid, int row, int column, int rows, int columns) {
        if (row < 0 || column < 0 || row >= rows || column >= columns || grid.get(row).get(column) == 0) {
            return;
        }

        grid.get(row).set(column, 0);
        dfs(grid, row - 1, column, rows, columns);
        dfs(grid, row + 1, column, rows, columns);
        dfs(grid, row, column - 1, rows, columns);
        dfs(grid, row, column + 1, rows, columns);
    }
    // METHOD SIGNATURE ENDS
}