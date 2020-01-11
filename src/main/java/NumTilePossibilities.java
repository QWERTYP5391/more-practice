import java.util.HashSet;
import java.util.Set;

public class NumTilePossibilities {

    private static Set<String> result = new HashSet<>();

    public static int numTilePossibilities(String tiles) {
        if (tiles == null || tiles.isEmpty()) {
            return 0;
        }

        getPossibilities("", tiles);


        return result.size();
    }

    private static void getPossibilities(String prefix, String suffix) {

        if (prefix.length() != 0) {
            result.add(prefix);
        }

        for (int i = 0; i < suffix.length(); i++) {
            getPossibilities(prefix + suffix.charAt(i), suffix.substring(0, i) + suffix.substring(i + 1));
        }
    }
}
