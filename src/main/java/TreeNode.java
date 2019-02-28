import java.util.ArrayList;

public class TreeNode {

    public Object data;
    public ArrayList<TreeNode> children;

    public TreeNode(Object data, ArrayList<TreeNode> children){
        this.data = data;
        this.children = children;
    }

    public void add(TreeNode data){
        children.add(data);
    }

    public Object remove(Object data){
        return children.remove(data);
    }
}
