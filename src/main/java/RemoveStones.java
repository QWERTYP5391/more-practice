class RemoveStones {
    private static int COUNT = 0;

    public static int removeStones(int[][] stones) {

        for(int i = 0; i < stones.length; i++){
            for(int j = 0; j < stones[0].length; j++){
                int current = stones[i][j];
                if(current >= 1){
                    dfs(i, j, stones);
                }
            }
        }

        return COUNT;

    }

    public static void dfs(int row, int column, int[][] arr){
        if(row >= arr.length - 1 || column >=  arr[0].length - 1){
            return;
        }

        dfs(row + 1, column, arr);

        dfs(row, column + 1, arr);

        if(arr[row][column] >= 1){
            arr[row][column]--;
            COUNT++;
        }

    }
}