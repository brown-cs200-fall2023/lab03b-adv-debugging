package sol;

import java.util.List;

public interface IBST {

    /**
     * Method to determine if the tree is a valid BST.
     *
     * @return a boolean indicating if the tree is a valid BST.
     */
    public boolean isBST();

    /**
     * Method to determine if all values in the tree are less than a value.
     *
     * @param val - the upper limit (exclusive) on the values in the tree.
     * @return a boolean indicating if all values in the tree are less than val.
     */
    public boolean allLess(int val);

    /**
     * Method to determine if all values in the tree are greater than or equal to
     * a value.
     *
     * @param val - the lower limit (inclusive) on the values in the tree.
     * @return a boolean indicating if all values in the tree are greater than or
     * equal to val.
     */
    public boolean allGreaterEq(int val);

    /**
     * Inserts an element into the IBST.
     *
     * @param n - a Comparable to be inserted to the tree
     * @return the IBST resulting from inserting n into the current IBST
     */
    public IBST insert(int n);

    /**
     * Checks whether a specific element is contained within the IBST.
     *
     * @param n - The element the user is searching for.
     * @return true if n is in the IBST, false otherwise.
     */
    public boolean contains(int n);

    public List<Integer> toList();
}
