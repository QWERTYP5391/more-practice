public class MyBSTNode<T> {

    public MyBSTNode<T> left;
    public MyBSTNode<T> right;
    public T data;

    public MyBSTNode(MyBSTNode<T> left, MyBSTNode<T> right, T data) {
        this.left = left;
        this.right = right;
        this.data = data;
    }
}
