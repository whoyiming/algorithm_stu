package com.hym.algorithm;

import java.util.Arrays;
import java.util.Random;

/**
 *
 *  理解快速排序算法的核心思想:
 *  第一步，选择一个值作为基准值；
 *  第二步，找到基准值的位置，并将小于基准值的元素放在基准值的前面，大于基准值的元素放在基准值的后面；
 *  第三步，对基准值的左右两侧递归地进行这个过程。
 *
 *  我们借助这个空位，将后面小于基准值的元素放到前面的空位上，这样后面就空出一位了。
 *  然后，我们再将前面大于基准值的元素放到后面这个空位上。就这样交替进行，直到空位前面的值都小于基准值，空位后面的值都大于基准值为止。
 */
public class QuickSort2 {

    public static void quickSort(int[] arr, int l, int r){
        if (l >= r) { return; }

        int x = l;
        int y = r;
        int pivot = arr[l];
        while ( x < y ) {
            // 当index x 小于 y 且从最左边遍历的元素都大于基准值
            while (x < y && arr[y] >= pivot) { y--; }
            // 当index x 小于 y，此时 arr[y]的值大于基准值，则将arr[y]赋值到基准值的位置
            if (x < y) { arr[x++] = arr[y]; }
            // 当index x 小于 y,再从右边开始遍历比较
            while (x < y && arr[x] <= pivot) { x++; }
            // 当index x 小于 y，此时 arr[x]的值小于基准值，则将arr[x]赋值到前面步骤arr[y]的位置
            if ( x < y ) { arr[y--] = arr[x]; }

        }

        // 将基准值放入arr[x]中
        arr[x] = pivot;
        quickSort(arr, l , x-1);
        quickSort(arr, x+1, r);
        return;
    }

    public static void quickSort2(int[] arr, int l, int r){
        while ( l < r ) {
            int x = l;
            int y = r;
            int pivot = getPivot(arr[l], arr[r], arr[ (l+r)>>1 ]);
            do {
                while ( arr[x] < pivot ) { x++; }
                while ( arr[y] > pivot ) { y--; }
                if (x <= y ) {
                    int temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
                    x++;
                    y--;
                }
            } while ( x <= y );
            quickSort2(arr, x, r);
            r = y;
        }
    }

    //比较三个数，取中间值
    private static int getPivot(int a, int b, int c) {
        int[] temp = {a, b, c};
        Arrays.sort(temp);
        return temp[1];
    }

    public static void main(String[] args){
        int arr[] = {10, 7, 8, 9, 1, 5};
        quickSort(arr,0,arr.length-1);
//        quickSort2(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

        test();
    }

    public static void test(){
        Random random = new Random();
        int len = 20000;
        int[] a1 = new int[len];
        int[] a2 = new int[len];
        for (int i = 0; i< len; i++) {
            a1[i] = random.nextInt();
            a2[i] = a1[i];
        }

        long start1 = System.currentTimeMillis();
        quickSort(a1,0, a1.length-1);
        System.out.println("quickSort:" + (System.currentTimeMillis() - start1));
        long start2 = System.currentTimeMillis();
        quickSort2(a2,0, a1.length-1);
        System.out.println("quickSort2:" + (System.currentTimeMillis() - start2));

    }
}
