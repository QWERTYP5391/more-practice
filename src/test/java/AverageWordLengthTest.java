import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class AverageWordLengthTest {

    @Test
    public void averageWordLengthThisisatest() {
        String input = "This is a test";
        double result = AverageWordLength.averageWordLength(input);

        assertThat(result, equalTo(2.75));
    }
}