import java.util.Arrays;

public class Capitalization {

    public static String capitalize(String input) {
        String[] split = input.split(" ");

        for (int i = 0; i < split.length; i++) {
            String s = split[i];
            char current = s.charAt(0);
            char c = Character.toUpperCase(current);
            split[i] = c + s.substring(1);
        }
        return String.join(" ", split);
    }
}
