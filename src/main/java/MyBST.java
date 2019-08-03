public class MyBST {

    public MyBSTNode<Integer> head;

    public void insert(Integer data) {
        MyStack<MyBSTNode<Integer>> myStack = new MyStack<>();
        if (head != null) {
            myStack.push(head);
            while (myStack.size() != 0) {
                MyBSTNode<Integer> pop = myStack.pop();
                Integer current = pop.data;
                if (current < data) {
                    MyBSTNode<Integer> right = pop.right;
                    if (right == null) {
                        pop.right = new MyBSTNode<>(null, null, data);
                    } else {
                        myStack.push(right);
                    }
                }
                if (current > data) {
                    MyBSTNode<Integer> left = pop.left;
                    if (left == null) {
                        pop.left = new MyBSTNode<>(null, null, data);
                    } else {
                        myStack.push(left);
                    }
                }
            }
        } else {
            head = new MyBSTNode<>(null, null, data);
        }
    }

    public boolean validate() {

        return validateHelper(head, null, null);
    }

    private boolean validateHelper(MyBSTNode<Integer> node, Integer min, Integer max) {

        if (min != null && node.data < min) {
            return false;
        }

        if (max != null && node.data > max) {
            return false;
        }

        if (node.left != null && !validateHelper(node.left, min, node.data)) {
            return false;
        }

        return node.right == null || validateHelper(node.right, node.data, max);
    }
}
