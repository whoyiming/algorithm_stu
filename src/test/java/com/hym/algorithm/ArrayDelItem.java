package com.hym.algorithm;

import java.util.Arrays;

/**
 * 模拟当删除首部元素时，先标记删除，当空间不足够时，再进行元素数组的空间清理
 */
public class ArrayDelItem {
    String[] strs = new String[5];
    int start = 0;
    int end = 0;

    public void addItem(String str){
        if (start ==0 && end == strs.length) {System.out.println("ele full");}
        if (start !=0 && end == strs.length) {
            moveItems(str);
        } else {
            strs[end++] = str;
        }

    }

    public String delItem(){
        if (start == end) {
            System.out.println("no ele");
            return null;
        }else {
            String str = strs[start];
            strs[start++] = null;
            return str;
        }
    }

    private void moveItems(String str) {
        int count = 0;
        for (int i = start; i < end; i++) {
            strs[count++] = strs[i];
        }
        //将移动后，原来位置的元素置为null
        for (int i = count;i < end; i++) {
            strs[i] = null;
        }
        start = 0;
        end = count;
        strs[end++] = str;
    }

    public static void main(String[] args){
        ArrayDelItem arrDel = new ArrayDelItem();
        arrDel.addItem("1");
        arrDel.addItem("2");
        arrDel.addItem("3");
        arrDel.addItem("4");
        arrDel.addItem("5");

        arrDel.delItem();
        arrDel.delItem();
        System.out.println(Arrays.toString(arrDel.strs));
        arrDel.addItem("6");

        System.out.println(Arrays.toString(arrDel.strs));

        arrDel.delItem();
        arrDel.delItem();
        arrDel.delItem();
        arrDel.delItem();
        arrDel.delItem();
        arrDel.delItem();
        System.out.println(Arrays.toString(arrDel.strs));
        arrDel.addItem("7");
        System.out.println(Arrays.toString(arrDel.strs));
        arrDel.addItem("8");
        System.out.println(Arrays.toString(arrDel.strs));

    }

}
