import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Anagrams {


    public static boolean isAnagram(String input, String input2) {
        if (isNullOrEmpty(input) || isNullOrEmpty(input2)) {
            return false;
        }


        Map<Character, Integer> characterOneMap = new HashMap<>();
        Map<Character, Integer> characterTwoMap = new HashMap<>();


        loadCharacterMap(input, characterOneMap);

        loadCharacterMap(input2, characterTwoMap);

        Set<Character> charactersOne = characterOneMap.keySet();
        Set<Character> charactersTwo = characterTwoMap.keySet();

        if (charactersOne.size() != charactersTwo.size()) {
            return false;
        }


        for (Character character : charactersOne) {
            if (!characterOneMap.get(character).equals(characterTwoMap.get(character))) {
                return false;
            }
        }


        return true;
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
