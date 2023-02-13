package sol;

import org.junit.Assert;
import org.junit.Test;
import src.BSTMaker1;
import src.BSTMaker2;
import src.BSTMaker3;
import src.BSTMaker4;

import java.util.ArrayList;
import java.util.Arrays;

public class BSTMakerTest {
    BSTMaker1 b1 = new BSTMaker1();
    BSTMaker2 b2 = new BSTMaker2();
    BSTMaker3 b3 = new BSTMaker3();
    BSTMaker4 b4 = new BSTMaker4();

    @Test
    public void testLeaf() {
        IBST t1 = this.b1.makeBST(new ArrayList<>());
        IBST t2 = this.b2.makeBST(new ArrayList<>());
        IBST t3 = this.b3.makeBST(new ArrayList<>());
        IBST t4 = this.b4.makeBST(new ArrayList<>());

        Assert.assertTrue(Oracle.bstOracle(t1, new ArrayList<>()));
        Assert.assertTrue(Oracle.bstOracle(t2, new ArrayList<>()));
        Assert.assertTrue(Oracle.bstOracle(t3, new ArrayList<>()));
        Assert.assertTrue(Oracle.bstOracle(t4, new ArrayList<>()));
    }

    @Test
    public void testRegTree() {
        IBST t1 = this.b1.makeBST(Arrays.asList(1, 2, 3, 4));
        IBST t2 = this.b2.makeBST(Arrays.asList(1, 2, 3, 4));

        Assert.assertTrue(Oracle.bstOracle(t1, Arrays.asList(1, 2, 3, 4)));
        Assert.assertTrue(Oracle.bstOracle(t2, Arrays.asList(1, 2, 3, 4)));
    }
}
