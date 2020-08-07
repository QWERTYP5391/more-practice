// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED

import java.util.List;
import java.util.Stack;

public class BstDistance {
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public int bstDistance(int num, List<Integer> values,
                           int node1, int node2) {
        // WRITE YOUR CODE HERE
        MyBST myBST = new MyBST();
        for (Integer value : values) {
            myBST.insert(value);
        }

        return findDistance(myBST.head, node1, node2);
    }

    public int findDistance(MyBSTNode<Integer>  root, int x, int y) {
        MyBSTNode<Integer>  lca = findLCA(root, x, y);

        return findLevel(lca, x, 0) + findLevel(lca, y, 0);
    }


    public int findLevel(MyBSTNode<Integer>  root, int node, int level) {

        if (root == null){
            return -1;
        }


        if (root.data == node){
            return level;
        }


        int left = findLevel(root.left, node, level + 1);

        if (left != -1){
            return left;
        }


        return findLevel(root.right, node, level + 1);
    }

    public static MyBSTNode<Integer>  findLCA(MyBSTNode<Integer> root, int x, int y) {
        if (root == null)
            return null;

        if (root.data == x || root.data == y)
            return root;

        MyBSTNode<Integer>  left = findLCA(root.left, x, y);

        MyBSTNode<Integer>  right = findLCA(root.right, x, y);

        if (left != null && right != null) {
            return root;
        }

        if (left != null) {
            return left;
        }

        return right;
    }
    // METHOD SIGNATURE ENDS
}

class MyBST {

    public MyBSTNode<Integer> head;

    public void insert(Integer data) {
        Stack<MyBSTNode<Integer>> stack = new Stack<>();
        if (head != null) {
            stack.push(head);
            while (stack.size() != 0) {
                MyBSTNode<Integer> pop = stack.pop();
                Integer current = pop.data;
                if (current < data) {
                    MyBSTNode<Integer> right = pop.right;
                    if (right == null) {
                        pop.right = new MyBSTNode<>(null, null, data);
                    } else {
                        stack.push(right);
                    }
                }
                if (current > data) {
                    MyBSTNode<Integer> left = pop.left;
                    if (left == null) {
                        pop.left = new MyBSTNode<>(null, null, data);
                    } else {
                        stack.push(left);
                    }
                }
            }
        } else {
            head = new MyBSTNode<>(null, null, data);
        }
    }
}

class MyBSTNode<T> {

    public MyBSTNode<T> left;
    public MyBSTNode<T> right;
    public T data;

    public MyBSTNode(MyBSTNode<T> left, MyBSTNode<T> right, T data) {
        this.left = left;
        this.right = right;
        this.data = data;
    }
}