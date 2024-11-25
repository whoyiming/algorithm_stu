package com.hym.leetcode;

/**
 * Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
 *
 * Example 1:
 * Input: head = [1,2,6,3,4,5,6], val = 6
 * Output: [1,2,3,4,5]
 *
 * Example 2:
 *
 * Input: head = [], val = 1
 * Output: []
 *
 * Example 3:
 *
 * Input: head = [7,7,7,7], val = 7
 * Output: []
 *
 */
public class RemoveLinkedListElements203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = new ListNode();
        prev.next = head;
        ListNode dumpyNode = prev;
        while (head != null) {
            if (head.val == val) {
                prev.next = head.next;
                head = head.next;
            } else {
                prev = head;
                head = head.next;
            }
        }
        return dumpyNode.next;
    }

    public static void main(String[] args){
        ListNode node = new ListNode();
        ListNode a = node;
        node.val = 7;
        RemoveLinkedListElements203 rd = new RemoveLinkedListElements203();
        rd.removeElements(a, 7);
    }
}
