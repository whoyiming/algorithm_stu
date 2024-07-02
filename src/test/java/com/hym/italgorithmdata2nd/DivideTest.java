package com.hym.italgorithmdata2nd;

public class DivideTest {

    public int divide(int dividend, int divisor) {
        if (dividend == 0x80000000 && divisor == -1){
            return Integer.MAX_VALUE;
        }
        int negative = 2;
        if (dividend > 0) {
            negative--;
            dividend = -dividend;
        }

        if (divisor > 0) {
            negative--;
            divisor = -divisor;
        }

        int result = divideCore(dividend, divisor);
        return negative == 1 ? -result : result;
    }

    private int divideCore(int dividend, int divisor) {
        int result = 0;
        while (dividend <= divisor) {
            int value = divisor;
            int quotient = 1;
            while (value >= 0xc0000000 && dividend <= value + value) {
                quotient += quotient;
                value += value;
            }

            result += quotient;
            dividend -= value;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(0x80000000);
        System.out.println(0xc0000000);
    }
}
