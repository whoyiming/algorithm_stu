package com.hym.leetcode;

import java.util.ArrayList;
import java.util.List;

public class NAryTreePreorderTraversal589 {

    public List<Integer> preorder(NAryNode root) {
        List<Integer> list = new ArrayList<>();
        recurPreOrder(root, list);
        return list;

    }

    private void recurPreOrder(NAryNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        for (NAryNode node : root.children) {
            recurPreOrder(node, list);
        }

    }
}
