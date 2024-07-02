package com.hym.algorithm;

import com.hym.leetcode.SpiralMatrix_54;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrixTest {
    int[][] matrix1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    int[][] matrix2 = {{1,2,3},{4,5,6},{7,8,9}};
    int[][] matrix3 = {{1,2,3},{5,6,7},{9,10,11},{12,13,14}};

    @Test
    public void test1() {
        List<Integer> result = new ArrayList<>(Arrays.asList(1,2,3,4,8,12,11,10,9,5,6,7));
        Assert.assertEquals(result, SpiralMatrix_54.spiralOrder(matrix1));
    }

    @Test
    public void test2() {
        List<Integer> result = new ArrayList<>(Arrays.asList(1,2,3,6,9,8,7,4,5));
        Assert.assertEquals(result, SpiralMatrix_54.spiralOrder(matrix2));
    }

    @Test
    public void test3() {
        List<Integer> result = new ArrayList<>(Arrays.asList(1,2,3,7,11,14,13,12,9,5,6,10));
        Assert.assertEquals(result, SpiralMatrix_54.spiralOrder(matrix3));
    }

    @Test
    public void test4() {
        List<Integer> result = new ArrayList<>(Arrays.asList(1,2,3,4,8,12,11,10,9,5,6,7));
        Assert.assertEquals(result, SpiralMatrix_54.spiralOrder2(matrix1));
    }

    @Test
    public void test5() {
        List<Integer> result = new ArrayList<>(Arrays.asList(1,2,3,6,9,8,7,4,5));
        Assert.assertEquals(result, SpiralMatrix_54.spiralOrder2(matrix2));
    }

    @Test
    public void test6() {
        List<Integer> result = new ArrayList<>(Arrays.asList(1,2,3,7,11,14,13,12,9,5,6,10));
        Assert.assertEquals(result, SpiralMatrix_54.spiralOrder2(matrix3));
    }
}
