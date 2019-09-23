import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class LongestPalindrome2 {

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        String longestPalindrome = "";
        int size = 0;
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(new Node(String.valueOf(s.charAt(0)), 0));
        Set<Node> visited = new HashSet<>();

        while (!queue.isEmpty()) {
            Node node = queue.remove();
            if (isPalindrome(node.value) && node.value.length() > size) {
                longestPalindrome = node.value;
                size = node.value.length();
            }
            if (node.index + 1 < s.length()) {
                Node next = new Node(node.value + s.charAt(node.index + 1), node.index + 1);
                if (!visited.contains(next)) {
                    queue.add(next);
                    visited.add(next);
                }
            }

            if (node.index < s.length()) {
                Node vertex = new Node(String.valueOf(s.charAt(node.index)), node.index);
                if (!visited.contains(vertex)) {
                    queue.add(vertex);
                    visited.add(vertex);
                }
            }
        }

        return longestPalindrome;

    }

    static boolean isPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return false;
        }

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


    static class Node {
        String value;
        int index;

        public Node(String value, int index) {
            this.value = value;
            this.index = index;
        }

        public boolean equals(Object obj) {
            return (obj instanceof Node) && ((Node) obj).value.equals(this.value) && ((Node) obj).index == this.index;
        }

        public int hashCode() {
            return value.hashCode() + index;
        }
    }
}
