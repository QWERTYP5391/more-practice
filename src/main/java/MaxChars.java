import java.util.HashMap;
import java.util.Map;

public class MaxChars {

    public static Character getMaxChar(String input) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        int max = -1;
        Character result = null;

        for (char character : input.toCharArray()) {
            characterIntegerMap.merge(character, 1, Integer::sum);
        }

        for (Character key : characterIntegerMap.keySet()) {
            Integer count = characterIntegerMap.get(key);
            if (count > max) {
                max = count;
                result = key;
            }
        }

        return result;
    }
}
