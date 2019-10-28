import org.junit.Test;

import static org.junit.Assert.*;

public class ReachingPointTest {

    @Test
    public void reachingPoints() {
        int sx = 1, sy = 1, tx = 3, ty = 5;

        assertTrue(ReachingPoint.reachingPoints(sx,sy,tx,ty))     ;
    }
}