package src;

import sol.IBST;
import java.util.List;

public class BSTMaker3 implements IBSTMaker {

    @Override
    public IBST makeBST(List<Integer> list) {
        IBST root;

        if (list.isEmpty()) {
            return new Leaf3();
        } else {
            root = new Node3(list.get(0), new Leaf3(), new Leaf3());
            List<Integer> sublist = list.subList(1, list.size());

            for (Integer e : sublist) {
                root = root.insert(e);
            }
            return root;
        }
    }
}
