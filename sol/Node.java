package sol;

import java.util.List;

public class Node implements IBST {

    public int value;
    public IBST left;
    public IBST right;

    /**
     * Instantiates a BST
     *
     * @param value - The value to be held in the root node.
     * @param left  - The left subtree
     * @param right - The right subtree
     */
    public Node(int value, IBST left, IBST right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node(int n, Leaf leaf, Leaf leaf1) {
        this.value = n;
        this.left = leaf;
        this.right = leaf1;
    }

    @Override
    public boolean isBST() {
        // TODO: use helper methods to fix this
        return false;
    }

    @Override
    public boolean allLess(int val) {
        return this.value < val && this.left.allLess(val) && this.right.allLess(val);
    }

    @Override
    public boolean allGreaterEq(int val) {
        return this.value >= val && this.left.allGreaterEq(val)
            && this.right.allGreaterEq(val);
    }

    @Override
    public List<Integer> toList() {
        List<Integer> lst = this.left.toList();
        lst.addAll(this.right.toList());
        lst.add(this.value);
        return lst;
    }


    @Override
    public IBST insert(int n) {
        if (n < this.value) {
            this.left = this.left.insert(n);
        } else {
            this.right = this.right.insert(n);
        }
        return this;
    }

    @Override
    public boolean contains(int n) {
        if (this.value == n) {
            return true;
        } else if (this.value < n) {
            return this.right.contains(n);
        } else {
            return this.left.contains(n);
        }
    }

    @Override
    public String toString() {
        String out = this.value + "\n";
        out += this.indentString(this.left.toString()) + "\n";
        out += this.indentString(this.right.toString());
        return out;
    }

    /**
     * Helper for toString.
     *
     * @param in - the toString representation so far.
     * @return a properly indented version of in.
     */
    private String indentString(String in) {
        String output = "";
        String[] lines = in.split("\n");

        for (int i = 0; i < lines.length; i++) {
            output += "  " + lines[i] + "\n";
        }

        // removes the last newline
        return output.substring(0, output.length() - 1);
    }
}
