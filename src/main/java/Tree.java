import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tree {

    public TreeNode root = null;


    public void traverseBS() {
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (queue.size() != 0) {
            TreeNode node = queue.remove();
            ArrayList<TreeNode> children = node.children;

            queue.addAll(children);
        }


    }

    public void traverseDS() {

        Stack<TreeNode> stack = new Stack<>();

        stack.push(root);

        while (stack.size() != 0) {
            TreeNode node = stack.pop();
            stack.addAll(node.children);
        }
    }


}
