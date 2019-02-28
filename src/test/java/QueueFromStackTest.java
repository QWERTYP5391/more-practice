import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class QueueFromStackTest {

    @Test
    public void add() {
        QueueFromStack<Integer> queueFromStack = new QueueFromStack<>();
        queueFromStack.add(1);
        queueFromStack.add(2);
        queueFromStack.add(3);

        assertThat(queueFromStack.remove(), equalTo(1));
    }

    @Test
    public void remove() {

        QueueFromStack<Integer> queueFromStack = new QueueFromStack<>();
        queueFromStack.add(1);
        queueFromStack.add(2);
        queueFromStack.add(3);

        assertThat(queueFromStack.remove(), equalTo(1));
        assertThat(queueFromStack.remove(), equalTo(2));
        assertThat(queueFromStack.remove(), equalTo(3));
    }

    @Test
    public void peek() {

        QueueFromStack<Integer> queueFromStack = new QueueFromStack<>();
        queueFromStack.add(1);
        queueFromStack.add(2);
        queueFromStack.add(3);

        assertThat(queueFromStack.peek(), equalTo(1));
    }
}