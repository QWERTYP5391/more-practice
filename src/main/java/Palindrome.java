public class Palindrome {

    public static boolean isPalindrome(String input){
        if(input == null || input.length() < 1){
            return false;
        }
        int differences = 0;
        int start = 0;
        int end = input.length() - 1;

        while(start < end){
            if(input.charAt(start) != input.charAt(end)){
                differences++;
            }
            start++;
            end--;
        }
        return differences < 1;
    }
}
