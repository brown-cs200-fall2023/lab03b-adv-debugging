package src;

import sol.IBST;
import sol.Leaf;

public class Leaf3 extends Leaf {
    @Override
    public IBST insert(int n) {
        return new Node3(n, new Leaf3(), new Leaf3());
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Leaf3;
    }

}
