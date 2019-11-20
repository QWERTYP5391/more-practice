import java.util.*;

class GetMinimumDifference {

    /*
     * Complete the 'getMinimumDifference' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY a
     *  2. STRING_ARRAY b
     */

    public static List<Integer> getMinimumDifference(List<String> a, List<String> b) {
        // Write your code here
        List<Integer> result = new ArrayList<>();

        if (a.size() != b.size()) {
            throw new IllegalArgumentException("The List of words should match a: " + a.size() + "b: " + b.size());
        }

        for (int i = 0; i < a.size(); i++) {
            result.add(getMinimumDifference(a.get(i), b.get(i)));
        }

        return result;
    }

    private static int getMinimumDifference(String a, String b) {
        int result = 0;

        if (b.length() != a.length()) {
            return -1;
        } else {
            Map<Character, Integer> aMap = new HashMap<>();
            Map<Character, Integer> bMap = new HashMap<>();

            for (int i = 0; i < a.length(); i++) {
                aMap.merge(a.charAt(i), 1, Integer::sum);
            }

            for (int i = 0; i < b.length(); i++) {
                bMap.merge(b.charAt(i), 1, Integer::sum);
            }

            Set<Character> bKeySet = bMap.keySet();

            for (Character bKey : bKeySet) {
                int aCount = aMap.get(bKey) != null ? aMap.get(bKey) : 0;
                int bCount = bMap.get(bKey);

                if (!aMap.get(bKey).equals(bMap.get(bKey))) {
                    result += Math.abs(aCount - bCount);
                }
            }
        }

        return result;
    }

}

