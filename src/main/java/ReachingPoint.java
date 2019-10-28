class ReachingPoint {

    private static boolean result = false;

    public static boolean reachingPoints(int sx, int sy, int tx, int ty) {
        dfs(sx, sy, tx, ty, new boolean[tx + 1][ty + 1]);

        return result;
    }

    private static void dfs(int sx, int sy, int tx, int ty, boolean[][] visited) {

        if (sx > tx || sy > ty) {
            return;
        }

        if (visited[sx][sy]) {
            return;
        }
        if (sx == tx && sy == ty) {
            result = true;
            return;
        }


        dfs(sx, sx + sy, tx, ty, visited);
        dfs(sx + sy, sy, tx, ty, visited);

        visited[sx][sy] = true;

    }
}