package com.hym.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
 *
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.
 *
 * Do not modify the linked list.
 */
public class LinkedListCycleII142 {

//    public ListNode detectCycle(ListNode head) {
//        if (head == null || head.next == null) { return null; }
//        Set<ListNode> set = new HashSet<>();
//        int cnt =0;
//        while (head != null) {
//            if (set.contains(head)) {
//                return head;
//            }
//            set.add(head);
//            head = head.next;
//        }
//
//        return null;
//    }

    //此处要搞懂的事当slow和fast相遇后，从头节点出发每走一步和slow每走一步，最终会在入环的第一个节点相遇。
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) { return null;}
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                while (slow != head) {
                    slow = slow.next;
                    head = head.next;
                }
                return head;
            }
        }

        return null;
    }

}
