
public class ReverseString {

    public static String reverse(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        char[] chars = input.toCharArray();
        int front = 0;
        int back = input.length() - 1;

        while (front < back) {
            char temp = chars[front];
            chars[front] = chars[back];
            chars[back] = temp;
            front++;
            back--;
        }

        return String.valueOf(chars);

    }
}
