import java.util.ArrayList;

public class MyQueue<T> {

    private final int FIRST = 0;
    private ArrayList<T> data = new ArrayList<T>();

    public void add(T item){
        data.add(item);
    }

    public T remove(){
        T value = data.get(FIRST);
        data.remove(FIRST);

        return value;

    }

    public T peek(){
        return data.get(FIRST);

    }
}
