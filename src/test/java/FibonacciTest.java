import org.junit.Test;

import java.util.HashMap;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void getFibonacciWith3() {
        int expected = 2;

        assertThat(Fibonacci.getFibonacci(3), equalTo(expected));
    }

    @Test
    public void getFibonacciWit0() {
        int expected = 0;

        assertThat(Fibonacci.getFibonacci(0), equalTo(expected));
    }

    @Test
    public void getFibonacciWit10() {
        int expected = 55;

        assertThat(Fibonacci.getFibonacci(10), equalTo(expected));
    }
}