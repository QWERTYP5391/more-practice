import java.util.*;

class CutBamboo {

    /*
     * Complete the 'cutBamboo' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY lengths as parameter.
     */

    public static List<Integer> cutBamboo(List<Integer> lengths) {
        // Write your code here
        List<Integer> lengthsLinkedList = new LinkedList<>(lengths);
        List<Integer> result = new ArrayList<>();
        result.add(lengthsLinkedList.size());
        while (lengthsLinkedList.size() != 0) {
            int min = 1001;

            for (int current : lengthsLinkedList) {
                if (current < min) {
                    min = current;
                }
            }

            ListIterator<Integer> listIterator = lengthsLinkedList.listIterator();
            while (listIterator.hasNext()) {
                Integer next = listIterator.next();
                if (next == min) {
                    listIterator.remove();
                } else {
                    listIterator.set(next - min);
                }
            }

            if (lengthsLinkedList.size() != 0) {
                result.add(lengthsLinkedList.size());
            }
        }

        return result;
    }
}