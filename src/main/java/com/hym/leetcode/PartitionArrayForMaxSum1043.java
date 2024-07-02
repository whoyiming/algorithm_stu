package com.hym.leetcode;

import java.util.Arrays;

public class PartitionArrayForMaxSum1043 {

    public static int maxSumAfterPartitioning(int[] arr, int k) {
        //k >= length
        //k < length
        for (int i = 0; i<arr.length; i++) {
            int max = 0;
            for (int n = i; n < i+k; n++) {
                if (max < arr[n]) {
                    max = arr[n];
                }
            }
            arr[i] = max;

            if (k + i == arr.length) {
                //代表子串已经取值到末端
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int i= 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int maxSumAfterPartitioning2(int[] A, int K) {
        int N = A.length, dp[] = new int[N + 1];
        for (int i = 1; i <= N; ++i) {
            int curMax = 0, best = 0;
            for (int j = 1; j <= K && i - j >= 0; ++j) {
                curMax = Math.max(curMax, A[i - j]);
                best = Math.max(best, dp[i - j] + curMax * j);
            }
            dp[i] = best;
        }
        System.out.println(Arrays.toString(dp));
        return dp[N];
    }
    public static void main(String[] args){
        int arr[] = new int[]{1,15,7,9,2,5,10};
        int k = 3;
        System.out.println(maxSumAfterPartitioning2(arr, k));
    }
}
