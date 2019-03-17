import org.junit.Test;

import static org.junit.Assert.*;

public class StepsTest {

    @Test
    public void printStepsWith3Rows() {
        int rows = 3;
        Steps.printSteps(rows);
    }

    @Test
    public void printStepsWith5Rows() {
        int rows = 5;
        Steps.printSteps(rows);
    }
}