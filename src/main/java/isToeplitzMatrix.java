class isToeplitzMatrix {

    public static boolean isToeplitzMatrix(int[][] matrix) {
        if(matrix == null){
            return false;
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(!isValidDiagonal(i, j, matrix)){
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isValidDiagonal(int row, int column, int[][] matrix){
        if (row < matrix.length && column < matrix[0].length) {
            int value = matrix[row][column];

            while(row < matrix.length && column < matrix[0].length){
                if(matrix[row][column] != value){
                    return false;
                }

                row++;
                column++;
            }
        }

        return true;
    }
}