import java.util.ArrayList;

public class SubTreeAverage {
    private static boolean result = true;

    public static boolean isSubTreeAverage(Node root) {
        helper(root, new ArrayList<>());
        return result;
    }

    private static ArrayList<Node> helper(Node node, ArrayList<Node> nodes) {
        ArrayList<Node> left = new ArrayList<>(nodes);

        if (node.left != null) {
            left = helper(node.left, left);
            left.add(node.left);
        }

        ArrayList<Node> right = new ArrayList<>(nodes);

        if (node.right != null) {
            right = helper(node.right, right);
            right.add(node.right);
        }

        right.addAll(left);

        if (!right.isEmpty() && node.val != calcAverage(right)) {
            result = false;
        }

        return right;
    }


    private static int calcAverage(ArrayList<Node> nodes) {
        int total = 0;
        for (Node node : nodes) {
            total += node.val;
        }

        return total == 0 ? 0 : total / nodes.size();
    }

    static class Node {
        public int val;

        public Node left;

        public Node right;

        public Node(int val) {
            this.val = val;
        }
    }
}


