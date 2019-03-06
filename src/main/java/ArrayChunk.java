import java.util.Arrays;

public class ArrayChunk {

    public static int[][] chunk(int[] array, int size) {

        if (array == null || array.length < 1) {
            return null;
        }

        int length = array.length;

        int rows = length / size;
        rows = (length % size) == 0 ? rows : rows + 1;
        int[][] ints = new int[rows][];
        int index = 0;
        int slice = 0;

        while (index < rows) {
            int to = slice + size < length ? slice + size : length;
            ints[index] = Arrays.copyOfRange(array, slice, to);
            slice += size;
            index++;
        }


        return ints;
    }
}