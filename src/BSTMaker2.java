package src;

import sol.IBST;
import sol.Leaf2;
import sol.Node2;

import java.util.List;

public class BSTMaker2 implements IBSTMaker {
    @Override
    public IBST makeBST(List<Integer> list) {
        IBST root;

        if (list.isEmpty()) {
            return new Leaf2();
        } else {
            root = new Node2(list.get(0), new Leaf2(), new Leaf2());
            List<Integer> items = list.subList(1, list.size());

            for (Integer item : items) {
                root = root.insert(item);
            }
        }
        return root;
    }
}
