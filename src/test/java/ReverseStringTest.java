import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class ReverseStringTest {

    @Test
    public void reverse() {
        String input = "Ebrima";
        String expected = "amirbE";

        assertThat(ReverseString.reverse(input), equalTo(expected));
    }
}