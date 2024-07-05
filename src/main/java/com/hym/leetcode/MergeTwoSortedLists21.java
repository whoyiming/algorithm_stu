package com.hym.leetcode;

public class MergeTwoSortedLists21 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode();
        ListNode node = dummyNode;
        while (list1 != null && list2 != null) {
            if (list1.val >= list2.val) {
                dummyNode.next = list2;
                dummyNode = dummyNode.next;
                list2 = list2.next;
            } else {
                dummyNode.next = list1;
                dummyNode = dummyNode.next;
                list1 = list1.next;
            }
        }
        if (list1 != null) {
            dummyNode.next = list1;
        }
        if (list2 != null) {
            dummyNode.next = list2;
        }
        return node.next;
    }

}
