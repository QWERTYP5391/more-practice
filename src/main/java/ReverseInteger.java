public class ReverseInteger {

    public static int reverseInteger(int input) {

        int i = Integer.parseInt(ReverseString.reverse(String.valueOf(Math.abs(input))));
        if (input < 0) {
            return i * -1;
        }

        return i;
    }
}
