import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class MaxEventsTest {

    @Test
    public void maxEvents() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(4);
        List<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(10);
        list2.add(3);
        list2.add(6);
        list2.add(4);
        list2.add(2);
        int maxEvents = MaxEvents.maxEvents(list1, list2);
        assertThat(maxEvents, equalTo(2));
    }
}