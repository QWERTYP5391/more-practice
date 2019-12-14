
import java.util.List;

public class MinimumHours {
    static int minimumHours(int rows, int columns, List<List<Integer>> grid) {
        boolean[][] visited = new boolean[rows][columns];
        boolean[][] changed;
        int hours = 0;
        while (find(grid, 0)) {
            changed = new boolean[rows][columns];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if (!changed[i][j] && !visited[i][j] && grid.get(i).get(j).equals(1)) {
                        visited[i][j] = true;
                        sendFileToNeighbors(i, j, grid, visited, changed);
                    }
                }
            }
            hours++;
        }

        return hours;
    }

    private static boolean find(List<List<Integer>> grid, int value) {
        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid.get(0).size(); j++) {
                Integer current = grid.get(i).get(j);
                if (current.equals(value)) {
                    return true;
                }

            }
        }

        return false;
    }

    private static void sendFileToNeighbors(int row, int column, List<List<Integer>> grid, boolean[][] visited, boolean[][] changed) {
        if (row + 1 < grid.size() && column < grid.get(0).size() && grid.get(row + 1).get(column).equals(0) && !visited[row + 1][column]) {
            changed[row + 1][column] = true;
            grid.get(row + 1).set(column, 1);
        }

        if (row - 1 >= 0 && row - 1 < grid.size() && column < grid.get(0).size() && !grid.get(row - 1).get(column).equals(0) && !visited[row - 1][column]) {
            changed[row - 1][column] = true;
            grid.get(row - 1).set(column, 1);
        }

        if ((row < grid.size() && column + 1 < grid.get(0).size()) && grid.get(row).get(column + 1).equals(0) && !visited[row][column + 1]) {
            changed[row][column + 1] = true;
            grid.get(row).set(column + 1, 1);
        }

        if (row < grid.size() && column - 1 >= 0 && column - 1 < grid.get(0).size() && grid.get(row).get(column - 1).equals(0) && !visited[row][column - 1]) {
            changed[row][column - 1] = true;
            grid.get(row).set(column - 1, 1);
        }
    }
}