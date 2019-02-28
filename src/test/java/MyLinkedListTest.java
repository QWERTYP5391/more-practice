import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class MyLinkedListTest {

    @Test
    public void insertFirst() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.insertFirst(1);
        myLinkedList.insertFirst(2);
        myLinkedList.insertFirst(3);

        assertThat(myLinkedList.getFirst().data, equalTo(3));
        assertThat(myLinkedList.getLast().data, equalTo(1));
        assertThat(myLinkedList.getMiddle().data, equalTo(2));
    }


    @Test
    public void getLast() {
    }

    @Test
    public void removeFirst() {
    }

    @Test
    public void removeLast() {
    }

    @Test
    public void size() {
    }

    @Test
    public void clear() {
    }

    @Test
    public void testGetMiddle() {

    }
}