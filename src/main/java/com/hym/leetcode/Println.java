package com.hym.leetcode;

import java.util.Arrays;

public class Println {

    public static void out(Object[] objects){
        System.out.println(Arrays.toString(objects));
    }

    public static void out(int[] objects){
        System.out.println(Arrays.toString(objects));
    }

    public static void out(Object object){System.out.println(object);}

    public static void out(Node node) {
        while (node != null) {
            System.out.print(node.getEle()+" ");
            node = node.getNext();
        }
    }
}
