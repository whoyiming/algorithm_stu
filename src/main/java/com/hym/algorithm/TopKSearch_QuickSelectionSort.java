package com.hym.algorithm;

/**
 * using quick selection sort to search top k.
 *
 * 基准值元素的排名 ind 与 k 之间的关系：
 *  如果 ind 正好等于 k，那说明当前的基准值，就是我们要找的排名第 k 位的元素；
 *  如果 ind 大于 k，说明排名第 k 位的元素在基准值的前面。接下来，我们要解决的问题就是，在基准值的前面查找排名第 k 位的元素；
 *  如果 ind 小于 k ，就说明排名第 k 位的元素在基准值的后面，并且，当前包括基准值在内的 ind 个元素，都是小于基准值的元素。
 *      那么，问题就转化成了，在基准值的后面查找排名第 k - ind 位的元素。
 */
public class TopKSearch_QuickSelectionSort {

    public static int quickSelect(int[] arr, int l, int r, int k){
        int x = l;
        int y = r;
        int pivot = arr[l];

        while ( x < y ) {
            while ( x < y && arr[y] >= pivot) { y--; }
            if ( x< y ) { arr[x++] = arr[y]; }
            while ( x < y && arr[x] <= pivot) { x++; }
            if ( x < y ) { arr[y--] = arr[x]; }
        }

        arr[x] = pivot;


        int ind = x - l + 1;
        if (ind == k) {return arr[x];}
        if (ind > k) {return quickSelect(arr, l, x - 1, k);}
        return quickSelect(arr, x + 1, r, k - ind);
    }

    public static void main(String[] args){
        int arr[] = {10, 7, 8, 9, 1, 5};
        System.out.println(quickSelect(arr, 0, arr.length-1, 3));
    }
}
