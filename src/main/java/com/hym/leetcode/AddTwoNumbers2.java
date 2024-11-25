package com.hym.leetcode;

public class AddTwoNumbers2 {

        // 这是我写的，看看下面别人写的，虽然意思一样，但下面的代码写得多精炼
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        int carry = 0;
//        ListNode dumpyNode = new ListNode();
//        ListNode node = dumpyNode;
//        while (l1 != null && l2 != null) {
//            int sum = l1.val + l2.val + carry;
//            carry = sum / 10;
//            ListNode temp = new ListNode();
//            temp.val = sum % 10;
//            node.next = temp;
//            node = node.next;
//            l1 = l1.next;
//            l2 = l2.next;
//        }
//
//        while (l1 != null) {
//            int sum = l1.val + carry;
//            carry = sum / 10;
//            ListNode temp = new ListNode();
//            temp.val = sum % 10;
//            node.next = temp;
//            node = node.next;
//            l1 = l1.next;
//        }
//        while (l2 != null) {
//            int sum = l2.val + carry;
//            carry = sum / 10;
//            ListNode temp = new ListNode();
//            temp.val = sum % 10;
//            node.next = temp;
//            node = node.next;
//            l2 = l2.next;
//        }
//        if (carry != 0) {
//            ListNode temp = new ListNode();
//            temp.val = carry;
//            node.next = temp;
//            node = node.next;
//        }
//
//        return dumpyNode.next;
//    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dumpy = new ListNode();
        ListNode node = dumpy;
        while (l1 != null || l2 != null || carry != 0) {
            int v1 = (l1 != null) ? l1.val : 0;
            int v2 = (l2 != null) ? l2.val : 0;
            int sum = v1 + v2 + carry;
            carry = sum / 10;
            node.next = new ListNode(sum%10);
            node = node.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        return dumpy.next;
    }

}
