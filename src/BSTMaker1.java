package src;

import sol.IBST;
import sol.Leaf1;
import sol.Node1;

import java.util.List;

public class BSTMaker1 implements IBSTMaker {
    @Override
    public IBST makeBST(List<Integer> list) {
        IBST root;

        if (list.isEmpty()) {
            return new Leaf1();
        } else {
            root = new Node1(list.get(0), new Leaf1(), new Leaf1());
            List<Integer> items = list.subList(1, list.size());

            for (Integer item : items) {
                root = root.insert(item);
            }
        }
        return root;
    }
}
