package com.hym.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LRUCache146 {

    private DLinkedNode head;
    private DLinkedNode tail;
    private int count;
    private int capacity;
    private Map<Integer, DLinkedNode> cache = new HashMap<>();

    public LRUCache146(int capacity) {
        this.head = new DLinkedNode();
        this.tail = new DLinkedNode();
        head.pre  = null;
        tail.post = null;
        head.post = tail;
        tail.pre  = head;

        this.count = 0;
        this.capacity = capacity;
    }

    public int get(int key) {
        DLinkedNode node = cache.get(key);
        if (node == null) {
            return -1;
        }
        this.moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        DLinkedNode node = cache.get(key);
        if (node == null) {
            node = new DLinkedNode();
            node.key = key;
            node.value = value;

            cache.put(key, node);
            this.addNode(node);
            count++;
            if (count > capacity) {
                DLinkedNode tail = popTail();
                cache.remove(tail.key);
                count--;
            }
        } else {
            node.value = value;
            moveToHead(node);
        }

    }

    // always add to head
    private void addNode(DLinkedNode node){
        node.post = head.post;
        node.pre  = head;

        head.post.pre = node;
        head.post = node;

    }

    private void removeNode(DLinkedNode node){
        DLinkedNode pre = node.pre;
        DLinkedNode post = node.post;

        pre.post = post;
        post.pre = pre;
    }

    private void moveToHead(DLinkedNode node){
        this.removeNode(node);
        this.addNode(node);
    }

    private DLinkedNode popTail(){
        DLinkedNode res = tail.pre;
        this.removeNode(res);
        return res;
    }

    class DLinkedNode {
        int key;
        int value;

        DLinkedNode pre;
        DLinkedNode post;
    }

}
