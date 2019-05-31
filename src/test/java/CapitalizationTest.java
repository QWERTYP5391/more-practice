import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class CapitalizationTest {

    @Test
    public void capitalize() {
        String result = Capitalization.capitalize("This is a test");
        String expected = "This Is A Test";

        assertThat(result, equalTo(expected));
    }
}