import org.junit.Test;
import sun.text.resources.cldr.uz.FormatData_uz_Latn;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class FindMaxNumberTest {

    @Test
    public void findMaxNumberWith997OneComma() {
        String s = "997";
        int k = 1;

        int expected = 97;
        assertThat(FindMaxNumber.findMaxNumber(s, k), equalTo(expected));
    }

    @Test
    public void findMaxNumberWith9978TwoCommas() {
        String s = "9978";
        int k = 2;

        int expected = 99;
        assertThat(FindMaxNumber.findMaxNumber(s, k), equalTo(expected));
    }

    @Test
    public void findMaxNumberWith49789ThreeCommas() {
        String s = "49789";
        int k = 3;

        int expected = 97;
        assertThat(FindMaxNumber.findMaxNumber(s, k), equalTo(expected));
    }

    @Test
    public void findMaxNumberWithEmptyString() {
        String s = "";
        int k = 3;

        int expected = 0;
        assertThat(FindMaxNumber.findMaxNumber(s, k), equalTo(expected));
    }

    @Test
    public void findMaxNumberWithNullString() {
        String s = null;
        int k = 3;

        int expected = 0;
        assertThat(FindMaxNumber.findMaxNumber(s, k), equalTo(expected));
    }

}