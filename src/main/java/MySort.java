import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.Arrays;

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

    public static int[] mergeSort(int[] array) {
        if (array.length == 1) {
            return array;
        }
        int middle = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, middle);
        int[] right = Arrays.copyOfRange(array, middle, array.length);

        return merge(mergeSort(left), mergeSort(right));

    }

    public static int[] merge(int[] left, int[] right) {
        if (left == null || right == null) {
            throw new IllegalArgumentException("Both arrays must be initialized left: " + Arrays.toString(left) + "right: " + Arrays.toString(right));
        }
        int leftPointer = 0;
        int rightPointer = 0;
        int index = 0;
        int[] output = new int[left.length + right.length];

        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] <= right[rightPointer]) {
                    output[index] = left[leftPointer];
                    leftPointer++;
                } else {
                    output[index] = right[rightPointer];
                    rightPointer++;
                }
            } else if (leftPointer < left.length) {
                output[index] = left[leftPointer];
                leftPointer++;
            } else {
                output[index] = right[rightPointer];
                rightPointer++;
            }
            index++;
        }

        return output;
    }
}

