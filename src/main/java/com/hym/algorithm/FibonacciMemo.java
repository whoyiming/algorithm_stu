package com.hym.algorithm;

public class FibonacciMemo {

    public int fibonacciMemo(int n, int[] memo){
        if (n ==0 || n ==1) {return n;}
        if (memo[n] != 0) {return memo[n];}

        if (n > 1) {
            memo[n] = fibonacciMemo(n-1, memo) + fibonacciMemo(n-2, memo);
            return memo[n];
        }

        return 0;
    }

    public int fibonacci(int n){
        int[] memo = new int[n+1];
        return fibonacciMemo(n, memo);
    }

    public static void main(String[] args){
        FibonacciMemo fm = new FibonacciMemo();
        long start = System.currentTimeMillis();
        System.out.println(fm.fibonacci(20));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
