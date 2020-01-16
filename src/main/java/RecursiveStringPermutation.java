import jdk.nashorn.internal.objects.annotations.Setter;

import java.util.HashSet;
import java.util.Set;

public class RecursiveStringPermutation {

    protected static Set<String> set = new HashSet<>();


    public static Set<String> getPermutations(String inputString) {

        // generate all permutations of the input string
        generatePermutations("", inputString);
        return set;
    }

    private static void generatePermutations(String prefix, String suffix) {
        if (suffix.length() == 0) {
            set.add(prefix);
            return;
        }

        for (int i = 0; i < suffix.length(); i++) {
            generatePermutations(prefix + suffix.charAt(i), suffix.substring(0, i) + suffix.substring(i + 1));
        }
    }

}
