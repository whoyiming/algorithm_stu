package com.hym.leetcode;

public class ClimbingStairs70 {

//    public static int climbStairs(int n) {
//        if (n ==0 || n == 1) { return 1;}
//
//        int dp[] = new int[n+1];
//        dp[0] = dp[1] = 1;
//        for (int i = 2; i <= n; i++) {
//            dp[i] = dp[i-1] + dp[i-2];
//        }
//        return dp[n];
//    }

    public static int climbStairs(int n){
        if (n ==0 || n == 1) { return 1;}
        int a = 1, b = 1, sum = 0;

        for (int i = 2; i<= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }

        return b;
    }



    //Recursion
//    public int climbStairs(int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        return climbStairs(n-1) + climbStairs(n-2);
//    }

    //Memoization
//    public int climbStairs(int n) {
//        Map<Integer, Integer> memo = new HashMap<>();
//        return climbStairs(n, memo);
//    }
//
//    private int climbStairs(int n, Map<Integer, Integer> memo) {
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        if (!memo.containsKey(n)) {
//            memo.put(n, climbStairs(n-1, memo) + climbStairs(n-2, memo));
//        }
//        return memo.get(n);
//    }
}
