package com.hym.leetcode;

/**
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
 * Return the linked list sorted as well.
 *
 * Input: head = [1,1,2]
 * Output: [1,2]
 *
 * Input: head = [1,1,2,3,3]
 * Output: [1,2,3]
 *
 * Constraints:
 *
 * The number of nodes in the list is in the range [0, 300].
 * -100 <= Node.val <= 100
 * The list is guaranteed to be sorted in ascending order.
 */
public class RemoveDuplicatesFromSortedList83 {

    public static Node deleteDuplicates(Node head) {
        if (head == null || head.getNext() == null) {return head;}
        Node slow = head;
        Node fast = slow.getNext();
        while (fast != null) {
            if (!slow.getEle().equals(fast.getEle())) {
                slow.setNext(fast);
                slow = slow.getNext();
            }
            fast = fast.getNext();
        }

        slow.setNext(null);
        return head;
    }
}
