package sol;

import java.util.ArrayList;
import java.util.List;

public class Leaf implements IBST {

    @Override
    public boolean isBST() {
        // TODO: use helper methods to fix this
        return false;
    }

    @Override
    public boolean allLess(int val) {
        return true;
    }

    @Override
    public boolean allGreaterEq(int val) {
        return true;
    }

    @Override
    public boolean contains(int n) {
        return false;
    }

    @Override
    public List<Integer> toList() {
        return new ArrayList<Integer>();
    }

    @Override
    public IBST insert(int n) {
        return new Node(n, new Leaf(), new Leaf());
    }
}
