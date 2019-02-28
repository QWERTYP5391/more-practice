import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class CapitilzationTest {

    @Test
    public void capitalize() {
        String input = "a short sentence";
        String expected = "A Short Sentence";

        assertThat(Capitalization.capitalize(input), equalTo(expected));
    }
}