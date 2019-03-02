import java.util.ArrayList;

public class MyStack<T> {

    private ArrayList<T> data = new ArrayList<T>();
    private int size;

    public void push(T item) {
        data.add(item);
        size++;
    }

    public T pop() {
        int size = data.size() - 1;
        if (size >= 0) {
            T value = data.get(size);
            data.remove(size);
            size--;
            return value;
        }

        return null;


    }

    public T peek() {
        int size = data.size() - 1;
        return size >= 0 ? data.get(size) : null;

    }

    public int size() {
        return size;
    }
}
