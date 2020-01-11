import java.util.HashMap;
import java.util.Map;

public class Anagrams {

    public static boolean isAnagram(String input, String input2) {
        if (isNullOrEmpty(input) || isNullOrEmpty(input2)) {
            return false;
        }

        Map<Character, Integer> characterOneMap = new HashMap<>();
        Map<Character, Integer> characterTwoMap = new HashMap<>();

        loadCharacterMap(input, characterOneMap);
        loadCharacterMap(input2, characterTwoMap);

        return characterOneMap.equals(characterTwoMap);
    }

    private static void loadCharacterMap(String input, Map<Character, Integer> characterOneMap) {
        for (char character : input.replaceAll("[^\\w\\s]", "").toLowerCase().toCharArray()) {
            characterOneMap.merge(character, 1, Integer::sum);
        }
    }

    private static boolean isNullOrEmpty(String input) {
        return input == null || input.length() < 1;
    }
}
