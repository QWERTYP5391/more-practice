import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class MyQueueTest {

    @Test
    public void add() {
        MyQueue myQueue = new MyQueue();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);

        int expected = 1;

        assertThat(myQueue.remove(), equalTo(expected));
    }

    @Test
    public void remove() {
        MyQueue myQueue = new MyQueue();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);


        assertThat(myQueue.remove(), equalTo(1));
        assertThat(myQueue.remove(), equalTo(2));
        assertThat(myQueue.remove(), equalTo(3));
    }

    @Test
    public void peek() {
        MyQueue myQueue = new MyQueue();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);

        int expected = 1;


        assertThat(myQueue.peek(), equalTo(expected));
    }
}