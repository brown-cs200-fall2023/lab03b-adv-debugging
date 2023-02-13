package sol;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class OracleTest {

    /**
     * Tests the bstOracle method with a standard BST.
     * <p>
     * ........5.............................................|
     * ...../.....\..........................................|
     * ....3.......7.........................................|
     * .../.\...../.\........................................|
     * .()...4...().().......................................|
     */
    @Test
    public void testBST1() {
        Node1 bt =
            new Node1(5, new Node1(3, new Leaf1(), new Node1(4)), new Node1(7));
        List<Integer> elems = new LinkedList<Integer>();
        elems.add(3);
        elems.add(4);
        elems.add(5);
        elems.add(7);

        Assert.assertTrue(Oracle.bstOracle(bt, elems));
    }

    /**
     * Tests the sameElems method with an empty BST.
     */
    @Test
    public void testBSTEmpty() {
        Leaf1 bt = new Leaf1();
        List<Integer> emptyList = new LinkedList<Integer>();

        // TODO: Add an Assert
    }

    /**
     * Tests the bstOracle method with a standard BST.
     * <p>
     * ........5.............................................|
     * ...../.....\..........................................|
     * ....3.......5.........................................|
     * .../.\...../.\........................................|
     * .()...4...().().......................................|
     */
    @Test
    public void testBSTDup() {
        Node1 bt =
            new Node1(5, new Node1(3, new Leaf1(), new Node1(4)), new Node1(5));
        List<Integer> elems = new LinkedList<Integer>();
        elems.add(3);
        elems.add(4);
        elems.add(5);
        elems.add(5);

        // TODO: Add an Assert
    }

    /**
     * Tests the bstOracle method with a standard BST.
     * <p>
     * ........5.............................................|
     * ...../.....\..........................................|
     * ....3.......7.......................................|
     * .../.\................................................|
     * .()...4...............................................|
     */
    @Test
    public void testBST2() {
        Node1 bt =
            new Node1(5, new Node1(3, new Leaf1(), new Node1(4)), new Node1(7));
        List<Integer> elems = new LinkedList<Integer>();
        elems.add(3);
        elems.add(4);
        elems.add(5);

        // TODO: Add an Assert
    }

    /**
     * Tests the bstOracle method with a standard BST.
     * <p>
     * ........5.............................................|
     * ...../.....\..........................................|
     * ....3.......7.........................................|
     * .../.\...../.\........................................|
     * .()...4...().().......................................|
     */
    @Test
    public void testBST3() {
        Node1 bt =
            new Node1(5, new Node1(3, new Leaf1(), new Node1(4)), new Node1(7));
        List<Integer> elems = new LinkedList<Integer>();
        elems.add(3);
        elems.add(4);
        elems.add(6);
        elems.add(7);

        // TODO: Add an Assert
    }

    /**
     * Tests the bstOracle method with a standard BST.
     * <p>
     * <p>
     * ........5.............................................|
     * ...../.....\..........................................|
     * ....4.......7.........................................|
     * .../.\...../.\........................................|
     * .()...3...().().......................................|
     */
    @Test
    public void testBST4() {
        Node1 bt =
            new Node1(5, new Node1(4, new Leaf1(), new Node1(3)), new Node1(7));
        List<Integer> elems = new LinkedList<Integer>();
        elems.add(3);
        elems.add(4);
        elems.add(5);
        elems.add(7);

        // TODO: Add an Assert
    }

    /**
     * Tests the bstOracle method with a standard BST.
     * <p>
     * ........5.............................................|
     * ...../.....\..........................................|
     * ....3.......7.........................................|
     * .../.\...../.\........................................|
     * .()...6...().().......................................|
     */
    @Test
    public void testBST5() {
        Node1 bt =
            new Node1(5, new Node1(3, new Leaf1(), new Node1(6)), new Node1(7));
        List<Integer> elems = new LinkedList<Integer>();
        elems.add(3);
        elems.add(6);
        elems.add(5);
        elems.add(7);

        // TODO: Add an Assert
    }
}
