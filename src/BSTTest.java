package src;

import org.junit.Assert;
import org.junit.Test;
import sol.IBST;
import sol.Leaf1;
import sol.Node1;

public class BSTTest {

    @Test
    public void testLeaf() {
        IBST leaf = new Leaf1();
        Assert.assertTrue(leaf.isBST());
        int nc = 12;
        Assert.assertFalse(leaf.contains(nc));
        leaf = leaf.insert(nc);
        Assert.assertEquals(leaf, new Node1(nc, new Leaf1(), new Leaf1()));
        Assert.assertTrue(leaf.isBST());
        Assert.assertTrue(leaf.contains(nc));
    }

    @Test
    public void testSmallTrees() {
        int twelve = 12;
        int thirteen = 13;
        int fourteen = 14;
        IBST small = new Node1(thirteen, new Leaf1(), new Leaf1());
        Assert.assertTrue(small.isBST());
        Assert.assertFalse(small.contains(twelve));
        Assert.assertTrue(small.contains(thirteen));
        Assert.assertFalse(small.contains(fourteen));
        small.insert(twelve);
        small.insert(fourteen);
        Assert.assertEquals(small, new Node1(thirteen, new Node1(twelve, new Leaf1(),
            new Leaf1()), new Node1(fourteen, new Leaf1(), new Leaf1())));
        Assert.assertTrue(small.contains(twelve));
        Assert.assertTrue(small.contains(thirteen));
        Assert.assertTrue(small.contains(fourteen));
        Assert.assertTrue(small.isBST());
        Assert.assertFalse(small.contains(15));
    }

    @Test
    public void testBadTree() {
        int twelve = 12;
        int thirteen = 13;
        IBST bad =
            new Node1(twelve, new Node1(thirteen, new Leaf1(), new Leaf1()), new Leaf1());
        Assert.assertFalse(bad.isBST());
    }
}
