package src;

import sol.IBST;
import sol.Node;

public class Node3 extends Node {
    public Node3(int value, IBST left, IBST right) {
        super(value, left, right);
    }

    @Override
    public IBST insert(int n) {
        if (n > this.value) {
            this.left = this.left.insert(n);
        } else {
            this.right = this.right.insert(n);
        }
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Node3)) {
            return false;
        } else {
            Node3 castNode = (Node3) obj;

            return this.value == castNode.value &&
                this.left.equals(castNode.left) &&
                this.right.equals(castNode.right);
        }
    }
}
