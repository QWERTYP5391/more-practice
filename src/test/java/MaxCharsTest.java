import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class MaxCharsTest {

    @Test
    public void getMaxChar() {
        String input = "aaabbbcccc";

        char expected = 'c';
        assertThat(MaxChars.getMaxChar(input), equalTo(expected));
    }
}