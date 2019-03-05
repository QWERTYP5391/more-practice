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

    @Test
    public void findMaxNumberWith9ZeroCommas() {
        String s = "9";
        int k = 0;

        int expected = 9;
        assertThat(FindMaxNumber.findMaxNumber(s, k), equalTo(expected));
    }

    @Test
    public void findMaxNumber9WithOneCommas() {
        String s = "9";
        int k = 1;

        int expected = 0;
        assertThat(FindMaxNumber.findMaxNumber(s, k), equalTo(expected));
    }

    @Test(expected = NumberFormatException.class)
    public void findMaxNumberWithNonNumberZeroCommas() {
        String s = "SSS";
        int k = 1;

        FindMaxNumber.findMaxNumber(s, k);
    }

    @Test
    public void findMaxNumberWith95OneCommas() {
        String s = "95";
        int k = 1;

        int expected = 9;
        assertThat(FindMaxNumber.findMaxNumber(s, k), equalTo(expected));
    }

    @Test
    public void findMaxNumberWith950786542654ThreeCommas() {
        String s = "507869542";
        int k = 3;

        int expected = 869542;
        assertThat(FindMaxNumber.findMaxNumber(s, k), equalTo(expected));
    }


}