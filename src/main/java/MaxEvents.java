import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


class MaxEvents {

    /*
     * Complete the 'maxEvents' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arrival
     *  2. INTEGER_ARRAY duration
     */

    public static int maxEvents(List<Integer> arrival, List<Integer> duration) {
        if (arrival == null || duration == null) {
            return 0;
        }
        List<List<Integer>> intervals = new ArrayList<>();

        for (int i = 0; i < arrival.size(); i++) {
            List<Integer> current = new ArrayList<>();
            current.add(arrival.get(i));
            current.add(arrival.get(i) + duration.get(i));
            intervals.add(current);
        }

        intervals.sort(Comparator.comparingInt(list -> list.get(0)));

        List<List<Integer>> merged = new ArrayList<>();
        if (intervals.size() > 0) {
            merged.add(intervals.get(0));
        }

        for (int i = 1; i < intervals.size(); i++) {
            List<Integer> current = intervals.get(i);
            List<Integer> last = merged.get(merged.size() - 1);
            if (last.get(1) >= current.get(0)) {
                List<Integer> combine = new ArrayList<>();
                combine.add(Math.min(last.get(0), current.get(0)));
                combine.add(Math.min(last.get(1), current.get(1)));
                merged.set(merged.size() - 1, combine);
            } else {
                merged.add(current);
            }

        }

        return merged.size();
    }

    /*

     arrivals [1 ,3, 3, 5, 7]
     duration [2 ,2, 1, 2, 1]

     # of non-overlapping intervals
     
     (intervals)
     start:
     end:

     then sory by start time

     (3, 5) i1
     (3, 4) i2

     if(i1[1] > i2[1]){
         merge
     }

    return size of non overlapping intervals
    
    */

}
