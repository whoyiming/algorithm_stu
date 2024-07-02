package com.hym.algorithm;

public class ReverseNode {
    Node headNode;

    static class Node<T> {
        T ele;
        Node next;
        Node() {}
        Node(T ele) { this.ele = ele;}
        Node(T ele, Node next) {
            this.ele = ele;
            this.next = next;
        }
    }

    private Node reverseNode(Node node) {
        Node pre = null;
        Node cur = node;
        Node next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        node = pre;

        return node;
    }

    private boolean checkCircle(Node node){
        if (node == null) {return false;}

        Node slow = node;
        Node fast = node.next;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {return true;}
        }

        return false;
    }

    private  Node<Integer> mergeSortedNode(Node<Integer> n1, Node<Integer> n2){
        Node<Integer> solder = new Node<>(0);
        Node node = solder;
        while (n1 != null && n2 != null) {
            Integer t1 = n1.ele;
            Integer t2 = n2.ele;
            if (t1 > t2) {
                solder.next = n2;
                n2 = n2.next;
            } else {
                solder.next = n1;
                n1 = n1.next;
            }
            solder = solder.next;
        }

        if (n1 != null) {solder.next = n1;}
        if (n2 != null) {solder.next = n2;}

        return node.next;
    }

    private Node delLastKthEle(Node node, int k){
        int count = 1;
        Node fast = node;
        while (fast != null && count < k) {
            fast = fast.next;
            count++;
        }
        if (fast == null) {return node;}

        Node slow = node;
        Node pre = null;
        while (fast.next != null) {
            fast = fast.next;
            pre = slow;
            slow = slow.next;
        }

        if (pre == null) {
            node = node.next;
        }else {
            pre.next = pre.next.next;
        }

        return node;
    }

    private Node findMiddleNode(Node node){
        if (node == null) return null;

        Node fast = node;
        Node slow = node;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }


    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.ele + " ");
            node = node.next;
        }
    }

    public static void main(String[] args){
        Node n1 = new Node<Integer>(1);
        Node n2 = new Node<Integer>(2);
        Node n3 = new Node<Integer>(3);

        ReverseNode rn = new ReverseNode();
        rn.headNode = n1;
        rn.headNode.next = n2;
        rn.headNode.next.next = n3;

        rn.printList(rn.headNode);
        System.out.println("");
//        rn.printList(rn.reverseNode(rn.headNode));


        System.out.println("checkCircle: " +rn.checkCircle(rn.headNode));

        Node n4 = new Node<Integer>(4);
        Node n5 = new Node<Integer>(5);
        Node n6 = new Node<Integer>(6);
        rn.printList(rn.headNode);
        rn.headNode.next.next.next = n4;
        rn.headNode.next.next.next.next = n5;
        rn.headNode.next.next.next.next.next = n6;
        rn.headNode.next.next.next.next.next.next = n3;

        System.out.println("checkCircle: " +rn.checkCircle(rn.headNode));


        ReverseNode rn2 = new ReverseNode();
        rn2.headNode = new Node(3);
        rn2.headNode.next = new Node(7);
        rn2.headNode.next.next = new Node(9);

        ReverseNode rn3 = new ReverseNode();
        rn3.headNode = new Node(2);
        rn3.headNode.next = new Node(8);
        rn3.headNode.next.next = new Node(10);
        rn.printList(rn2.headNode);
        rn.printList(rn3.headNode);

        Node nm = rn.mergeSortedNode(rn3.headNode, rn2.headNode);
        System.out.println("");
        rn.printList(nm);

        System.out.println("");
        rn.printList(rn.delLastKthEle(nm,7));
    }
}
