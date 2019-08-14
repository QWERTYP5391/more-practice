public class BSTNode<T> {

    public T data;
    public BSTNode left;
    public BSTNode right;

    public BSTNode(T data, BSTNode<T> left, BSTNode<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
