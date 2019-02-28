public class ReverseString {


    public static String reverse(String input){

        if(input == null){
            return "";
        }

        int start = 0;
        int end = input.length() - 1;
        char[] charArray = input.toCharArray();

        while (start < end){
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        return String.valueOf(charArray);

    }
}
