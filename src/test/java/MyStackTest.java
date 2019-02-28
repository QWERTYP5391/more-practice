import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class MyStackTest {

    @Test
    public void push() {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        assertThat(myStack.pop(), equalTo(3));
    }

    @Test
    public void pop() {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        assertThat(myStack.pop(), equalTo(3));
        assertThat(myStack.pop(), equalTo(2));
        assertThat(myStack.pop(), equalTo(1));
        assertThat(myStack.pop(), equalTo(null));
    }

    @Test
    public void peek() {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        assertThat(myStack.peek(), equalTo(3));
    }
}