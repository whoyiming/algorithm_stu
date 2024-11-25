package com.hym.leetcode;

import java.util.List;

public class NAryNode {
    int val;
    List<NAryNode> children;

    public NAryNode(int val) {
        this.val = val;
    }

    public NAryNode(int val, List<NAryNode> children) {
        this.val = val;
        this.children = children;
    }
}
