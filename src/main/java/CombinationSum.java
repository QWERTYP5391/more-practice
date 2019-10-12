import java.util.ArrayList;
import java.util.List;

class CombinationSum {
    private static List<List<Integer>> solution = new ArrayList<>();

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        backtrack(0, new ArrayList<>(), candidates, 0, target);

        return solution;
    }

    private static void backtrack(int index, List<Integer> combination, int[] arr, int sum, int target) {
        if (sum > target) {
            return;
        }

        if (sum == target) {
            List<Integer> clone = new ArrayList<>(combination);
            solution.add(clone);
            return;
        }

        for (int i = index; i < arr.length; i++) {
            int current = arr[i];
            combination.add(current);
            backtrack(i, combination, arr, sum + current, target);
            combination.remove(combination.size() - 1);
        }
    }
}