public class BubbleSort {

    public static void main(String[] args) {



    }


    public static void swap(int [] array, int i, int j){

        if(i == j){
            return;
        }

        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;

    }
}

