public class QueueFromStack <T>{

    private MyStack<T> myStack1 = new MyStack<>();
    private MyStack<T> myStack2 = new MyStack<>();


    public void add(T item){
        myStack1.push(item);
    }

    public T remove(){
        while(myStack1.peek() != null){
            myStack2.push(myStack1.pop());
        }

        T result = myStack2.pop();

        while(myStack2.peek() != null){
            myStack1.push(myStack2.pop());
        }

        return result;



    }

    public T peek(){
        while(myStack1.peek() != null){
            myStack2.push(myStack1.pop());
        }

        T result = myStack2.peek();

        while(myStack2.peek() != null){
            myStack1.push(myStack2.pop());
        }

        return result;
    }
}
