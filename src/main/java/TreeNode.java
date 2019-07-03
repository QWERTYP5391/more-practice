import java.util.ArrayList;

public class TreeNode<T> {

    public T data;
    public ArrayList<TreeNode> children;

    public TreeNode(T data, ArrayList<TreeNode> children){
        this.data = data;
        this.children = children;
    }

    public void add(TreeNode<T> data){
        children.add(data);
    }

    public boolean remove(T data){
        return children.remove(data);
    }
}
