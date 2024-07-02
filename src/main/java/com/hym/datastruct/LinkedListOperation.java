package com.hym.datastruct;

/**
 * 链表的操作：
 *  反转
 *  检查环
 *  合并两个有序链表
 *  删除最后第K个元素
 *  找到中间节点
 */
public class LinkedListOperation {

    public static Node<Integer> reverseNode(Node<Integer> node){
        Node pre = null;
        Node cur = node;
        Node next = null;
        while (cur != null) {
            next = cur.getNext();
            cur.setNext(pre);
            pre = cur;
            cur = next;
        }

        return pre;
    }

    public static boolean checkCircle(Node<Integer> node){
        if (node == null) {return false;}
        Node slow = node;
        Node fast = node.getNext();

        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();

            if (slow == fast) {return true;}
        }

        return false;
    }

    public static Node merge2SortedNode(Node<Integer> node1, Node<Integer> node2){
        Node solder = new Node<Integer>();
        Node node = solder;

        while (node1 != null && node2 != null){
            Integer v1 = node1.getEle();
            Integer v2 = node2.getEle();
            if (v1.compareTo(v2) <= 0) {
                node.setNext(node1);
                node1 = node1.getNext();
            } else {
                node.setNext(node2);
                node2 = node2.getNext();
            }

            node = node.getNext();
        }

        if (node1 == null) {
            node.setNext(node2.getNext());
        }
        if (node2 == null) {
            node.setNext(node1.getNext());
        }

        return solder.getNext();
    }

    public static Node delLastKthEle(Node<Integer> node, int k) {
        Node fast = node;
        int count = 1;
        //链表中的元素少于K个
        while (fast != null && count < k) {
            fast = fast.getNext();
            count++;
        }
        if (fast == null) {return node;}

        Node pre = null;
        Node slow = node;
        while (fast.getNext() != null) {
            fast = fast.getNext();
            pre = slow;
            slow = slow.getNext();
        }

        //链表中元素等于K个
        if (pre == null) {
            node = node.getNext();
        } else {
            pre.setNext(pre.getNext().getNext());
        }

        return node;
    }

    public static Node findMiddleNode(Node<Integer> node){
        if (node == null) {return node;}

        Node fast = node;
        Node slow = node;

        while (fast != null && fast.getNext() != null) {
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }

        return slow;
    }

    public static void main(String[] args){
        Node n1 = new Node<Integer>(1);
        Node n2 = new Node<Integer>(2);
        Node n3 = new Node<Integer>(3);
        n1.setNext(n2);
        n2.setNext(n3);
        System.out.println("初始Node：");
        println(n1);

        Node rn = reverseNode(n1);
        System.out.println("反转后的Node：");
        println(rn);

        Node n4 = new Node<Integer>(4);
        Node n5 = new Node<Integer>(5);
        Node n6 = new Node<Integer>(6);
        Node n7 = new Node<Integer>(7);
        Node n8 = new Node<Integer>(8);
        n4.setNext(n5);
        n5.setNext(n6);
        n6.setNext(n7);
        n7.setNext(n8);
        n8.setNext(n6);
        System.out.println("检查Node是否有环：");
        System.out.println(checkCircle(n4));

        Node ns1 = new Node<Integer>(3);
        Node ns2 = new Node<Integer>(4);
        Node ns3 = new Node<Integer>(5);
        Node ns4 = new Node<Integer>(6);
        Node ns5  = new Node<Integer>(7);
        Node ns6 = new Node<Integer>(8);
        ns1.setNext(ns3);
        ns3.setNext(ns5);
        ns2.setNext(ns4);
        ns4.setNext(ns6);
        System.out.println("合并两个有序链表：");
        Node n = merge2SortedNode(ns1,ns2);
        println(n);

        System.out.println("删除倒数第K个元素：");
        println(delLastKthEle(n,5));

        System.out.println("查找中间元素：");
        println(n);
        System.out.println(findMiddleNode(n));

    }

    public static void println(Node node){
        while (node != null) {
            System.out.print(node.getEle() + " ");
            node = node.getNext();
        }
        System.out.println("");
    }
}
