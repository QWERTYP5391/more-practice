import org.junit.Test;

import static org.junit.Assert.*;

public class MyBSTTest {

    @Test
    public void insertWithPositiveValidation() {
        MyBST myBST = new MyBST();
        myBST.insert(1);
        myBST.insert(4);
        myBST.insert(2);
        myBST.insert(3);

        assertTrue(myBST.validate());

    }

    @Test
    public void insertWithNegativeValidation() {
        MyBST myBST = new MyBST();
        myBST.insert(1);
        myBST.head.right = new MyBSTNode<>(null, null, 0);

        assertFalse(myBST.validate());

    }
}