package com.hym.leetcode;

/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
Example:
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.

Complexity Analysis

Time complexity : O(max(m,n)). Assume that m and n represents the length of l1 and l2 respectively, the algorithm above iterates at most max(m,n) times.

Space complexity : O(max(m,n)). The length of the new list is at most max(m,n)+1.
 */
public class AddTwoNumbers {
    public static Node addTwoNumbers(Node<Integer> l1, Node<Integer> l2) {

        Node ln = new Node(0);
        Node dummyNode = ln;
        int rem = 0;
        while(l1 != null || l2 != null){
            int val1 = l1 != null ? l1.getEle() : 0;
            int val2 = l2 != null ? l2.getEle() : 0;
            int temp = val1 + val2 + rem;
            ln.setNext(new Node(temp%10));
            ln = ln.getNext();

            rem = temp/10;

            if (l1 != null) {l1 = l1.getNext();}
            if (l2 != null) {l2 = l2.getNext();}

        }

        if (rem != 0) {ln.setNext(new Node(rem));}

        return dummyNode.getNext();
    }

}


