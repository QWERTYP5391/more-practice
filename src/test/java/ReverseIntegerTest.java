import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class ReverseIntegerTest {

    @Test
    public void reverseInteger51() {
        int input = 51;
        int expected = 15;

        assertThat(ReverseInteger.reverseInteger(input), equalTo(expected));
    }

    @Test
    public void reverseIntegerNegative51() {
        int input = -51;
        int expected = -15;

        assertThat(ReverseInteger.reverseInteger(input), equalTo(expected));
    }

    @Test
    public void reverseIntegerNegative90() {
        int input = -90;
        int expected = -9;

        assertThat(ReverseInteger.reverseInteger(input), equalTo(expected));
    }

    @Test
    public void reverseIntegerNegative500() {
        int input = 500;
        int expected = 5;

        assertThat(ReverseInteger.reverseInteger(input), equalTo(expected));
    }

    @Test
    public void reverseIntegerNegative189() {
        int input =  189;
        int expected = 981;

        assertThat(ReverseInteger.reverseInteger(input), equalTo(expected));
    }

    @Test
    public void reverseIntegerZero() {
        int input = 0;
        int expected = 0;

        assertThat(ReverseInteger.reverseInteger(input), equalTo(expected));
    }
}