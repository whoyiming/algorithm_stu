package com.hym.sword_pointing_offer;

/**
 * 题目：输入2个int型整数，它们进行除法计算并返回商，要求不得使用乘号'*'、除号'/'及求余符号'%'。
 * 当发生溢出时，返回最大的整数值。假设除数不为0。例如，输入15和2，输出15/2的结果，即7。
 */
public class DecimalDivide1 {
    public int divide(int dividend, int divisor) {
        if (dividend ==  Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        return 0;
    }

}
