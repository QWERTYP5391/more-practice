public class MySort {

    public static int[] bubbleSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < (array.length - i) - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
        return array;
    }


    public static void swap(int[] array, int i, int j) {

        if (i == j) {
            return;
        }

        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}

