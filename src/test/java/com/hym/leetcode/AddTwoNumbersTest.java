package com.hym.leetcode;


import org.junit.Assert;
import org.junit.Test;


public class AddTwoNumbersTest {

    /**
     * l1=[0,1]
     * l2=[0,1,2]
     */
    @Test
    public void test() {
        Node<Integer> n1 = new Node<Integer>(0);
        n1.setNext(new Node<Integer>(1));

        Node<Integer> n2 = new Node<>(0);
        n2.setNext(new Node<Integer>(1));
        n2.getNext().setNext(new Node<Integer>(2));

        int res = covertNode2Digit(AddTwoNumbers.addTwoNumbers(n1,n2));
        Assert.assertEquals(220,res);
    }

    /**
     * l1=[]
     * l2=[0,1]
     */
    @Test
    public void test2() {
        Node<Integer> n1 = null;

        Node<Integer> n2 = new Node<>(0);
        n2.setNext(new Node<Integer>(1));

        int res = covertNode2Digit(AddTwoNumbers.addTwoNumbers(n1,n2));
        Assert.assertEquals(10, res);
    }

    /**
     * l1=[9,9]
     * l2=[9]
     */
    @Test
    public void test3() {
        Node<Integer> n1 = new Node<Integer>(9);

        Node<Integer> n2 = new Node<>(9);
        n2.setNext(new Node<Integer>(9));

        int res = covertNode2Digit(AddTwoNumbers.addTwoNumbers(n1,n2));
        Assert.assertEquals(108, res);
    }

    /**
     * l1=[9,9]
     * l2=[9,9]
     */
    @Test
    public void test4() {
        Node<Integer> n1 = new Node<Integer>(9);
        n1.setNext(new Node<Integer>(9));

        Node<Integer> n2 = new Node<>(9);
        n2.setNext(new Node<Integer>(9));

        int res = covertNode2Digit(AddTwoNumbers.addTwoNumbers(n1,n2));
        Assert.assertEquals(198, res);
    }

    private int covertNode2Digit(Node<Integer> node) {
        if (node == null) {return 0;}
        StringBuilder temp= new StringBuilder("");
        while (node != null){
            temp.append(node.getEle());
            node = node.getNext();
        }

        return Integer.parseInt(temp.reverse().toString());
    }
}
