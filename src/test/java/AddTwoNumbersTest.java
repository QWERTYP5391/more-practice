import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoNumbersTest {

    @Test
    public void addTwoNumbers() {

        AddTwoNumbers.ListNode l1 = new AddTwoNumbers.ListNode(9);
        l1.next = new AddTwoNumbers.ListNode(8);
        AddTwoNumbers.ListNode l2 = new AddTwoNumbers.ListNode(1);

        AddTwoNumbers.ListNode listNode = AddTwoNumbers.addTwoNumbers(l1, l2);
    }
}