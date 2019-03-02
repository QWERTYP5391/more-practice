public class MyBSTNode<T> {

    public MyBSTNode left;
    public MyBSTNode right;
    public T data;

    public MyBSTNode(MyBSTNode left, MyBSTNode right, T data) {
        this.left = left;
        this.right = right;
        this.data = data;
    }
}
