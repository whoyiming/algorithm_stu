package com.hym.algorithm;

public class Fibonacci {

    public static int fibonacci(int n){
        if (n == 0 || n == 1) {return n;}
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args){
        long start = System.currentTimeMillis();
        System.out.println(fibonacci(20));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
