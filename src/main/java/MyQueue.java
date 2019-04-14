import java.util.ArrayList;

public class MyQueue<T> {

    private final int FIRST = 0;
    private ArrayList<T> data = new ArrayList<T>();
    private int size = 0;

    public void add(T item) {
        data.add(item);
        size++;
    }

    public T remove() {
        T value = data.get(FIRST);
        data.remove(FIRST);
        size--;

        return value;

    }

    public T peek() {
        return data.get(FIRST);

    }

    public int size() {
        return size;
    }
}
