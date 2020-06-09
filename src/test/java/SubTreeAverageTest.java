import org.junit.Test;

import static org.junit.Assert.assertTrue;

class SubTreeAverageTest {

    @Test
    void isSubLevelAverage() {
        SubTreeAverage.Node root = new SubTreeAverage.Node(2);
        root.left = new SubTreeAverage.Node(2);
        root.left.left = new SubTreeAverage.Node(2);

        root.right = new SubTreeAverage.Node(2);
        root.right.left = new SubTreeAverage.Node(1);
        root.right.right = new SubTreeAverage.Node(3);

        boolean subTreeAverage = SubTreeAverage.isSubTreeAverage(root);
        assertTrue(subTreeAverage);

    }
}