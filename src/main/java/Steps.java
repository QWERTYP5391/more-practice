public class Steps {

    public static void printSteps(int rows) {
        if (rows < 1) {
            return;
        }

        int[][] matrix = new int[rows][rows];

        for (int row = 0; row < matrix.length; row++) {
            StringBuilder columnString = new StringBuilder();
            for (int column = 0; column < matrix[0].length; column++) {
                if (column <= row) {
                    columnString.append("#");
                } else {
                    columnString.append(" ");
                }
            }
            System.out.println(columnString);
        }

    }
}
