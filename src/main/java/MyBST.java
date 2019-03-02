public class MyBST<T> {

    public MyBSTNode<T> head;

    public void insert (T data){
        MyStack myStack = new MyStack();
        if(head != null){
            myStack.push(head);
            int size = myStack.size();
            while (size != 0){
                for(int i = 0; i < size; i++){

                }
            }
        }
        else{
            head = new MyBSTNode<>(null, null, data);
        }
    }
}
