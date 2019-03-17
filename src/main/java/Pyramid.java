public class Pyramid {

    public static void printPyramid(int rows) {
        if(rows < 1){
            return;
        }

        int size = (rows * 2) - 1;
        int midpoint = size / 2;

        int[][] matrix = new int[rows][size];

        for(int row = 0; row <  matrix.length; row++){
            StringBuilder stringBuilder = new StringBuilder();
            for(int column = 0; column < matrix[0].length; column++){
                if(column >= midpoint - row && column <= midpoint + row){
                    stringBuilder.append("#");
                }
                else {
                    stringBuilder.append(" ");
                }
            }
            System.out.println(stringBuilder);
        }

    }
}
