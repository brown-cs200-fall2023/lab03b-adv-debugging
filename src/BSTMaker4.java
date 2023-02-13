package src;

import sol.IBST;
import sol.Leaf;
import sol.Leaf1;
import sol.Node1;

import java.util.List;

public class BSTMaker4 implements IBSTMaker {

    @Override
    public IBST makeBST(List<Integer> list) {
        IBST root;
        if (list.isEmpty()) {
            return new Leaf1();
        } else {
            root = new Node1(list.get(0), new Leaf(), new Leaf());
            List<Integer> sublist = list.subList(0, list.size());

            for (Integer elt : sublist) {
                root = root.insert(elt);
            }
        }
        return root;
    }

}
