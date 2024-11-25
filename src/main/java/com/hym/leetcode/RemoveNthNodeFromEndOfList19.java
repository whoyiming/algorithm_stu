package com.hym.leetcode;

public class RemoveNthNodeFromEndOfList19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int cnt = 0;
        ListNode loop = head;
        ListNode dumpyNode = new ListNode();
        dumpyNode.next = head;
        ListNode prev = dumpyNode;
        while (loop != null) {
            cnt++;
            loop = loop.next;
        }

        if (cnt < n || n == 0) { return head; }

        int i = 1;
        while (head != null) {
            if (i == (cnt - n +1)) {
                prev.next = head.next;
                break;
            }
            i++;
            prev = head;
            head = head.next;
        }

        return dumpyNode.next;
    }

}
