package com.hym.algorithm;

/**
 * using quick select to find the kth.
 */
public class QuickSelect {


    public static int quickSelect(int[] arr, int l, int r, int k) {
        //首先选取基准值，完成 partition 操作
        int pivot = arr[l];
        int x = l;
        int y = r;

        while (x < y) {
            while (x <y && arr[y] >= pivot) { y--; }
            if (x<y) { arr[x++] = arr[y]; }
            while (x<y && arr[x] <= pivot) { x++; }
            if (x<y) {arr[y--] = arr[x]; }
        }

        arr[x] = pivot;
        // ind 为当前基准值的排名
//        int ind = x - l + 1;
//        if ( ind == k) {
//            return pivot;
//        } else if ( k < ind){
//            return quickSelect(arr, l, x-1, k);
//        } else {
//            return quickSelect(arr, x+1, r, k-ind);
//        }

        int ind = x + 1;
        if ( ind == k) {
            return pivot;
        } else if ( k < ind){
            return quickSelect(arr, l, x-1, k);
        } else {
            return quickSelect(arr, x+1, r, k);
        }
    }

    public static void main(String[] args){
        int arr[] = {10, 7, 8, 9, 1, 5};
        System.out.println(quickSelect(arr, 0, arr.length - 1, 5));
    }

}
