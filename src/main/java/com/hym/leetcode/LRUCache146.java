package com.hym.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LRUCache146 {

    private DLinkeNode head;
    private DLinkeNode tail;
    private int count;
    private int capacity;
    private Map<Integer, DLinkeNode> cache;

    public LRUCache146(int capacity) {
        this.count = 0;
        this.capacity = capacity;
        this.head = new DLinkeNode();
        this.tail = new DLinkeNode();
        head.pre  = null;
        head.post = tail;
        tail.pre  = head;
        tail.post = null;
        cache = new HashMap<>();
    }

    public int get(int key) {
        DLinkeNode node = cache.get(key);
        if (node == null) {
            return -1;
        }
        removeNode(node);
        addNode(node);
        return node.val;
    }

    public void put(int key, int value) {
        DLinkeNode node = cache.get(key);
        if (node == null) {
            node = new DLinkeNode();
            node.key = key;
            node.val = value;
            cache.put(key, node);
            addNode(node);
            count++;

            if (count > capacity) {
                DLinkeNode tail = popTail();
                cache.remove(tail.key);
                count--;
            }
        } else {
            node.val = value;
            removeNode(node);
            addNode(node);
        }
    }

    private void addNode(DLinkeNode node){
        head.post.pre = node;
        node.post = head.post;

        head.post = node;
        node.pre  = head;
    }

    private void removeNode(DLinkeNode node){
        DLinkeNode pre = node.pre;
        DLinkeNode post = node.post;

        pre.post = post;
        post.pre = pre;
    }

    private DLinkeNode popTail(){
        DLinkeNode res = tail.pre;
        removeNode(res);
        return res;
    }

    class DLinkeNode{
        int key;
        int val;
        DLinkeNode pre;
        DLinkeNode post;
    }

}
