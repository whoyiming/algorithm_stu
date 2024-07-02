package com.hym.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an m x n matrix, return all elements of the matrix in spiral order.
 * Example 1:
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [1,2,3,6,9,8,7,4,5]
 *
 * Example 2:
 * Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 *
 */
public class SpiralMatrix_54 {

    /*
    方法 1 ：模拟遍历
    首先，我们需要定义行和列的方向数组，因为当遍历到矩阵的边界需要换方向。同时遍历到已经遍历过的元素时也需要换方向，不然就一直在最外层转圈了
    行的方向数组 int[] dr = {0, 1, 0, -1} 向右，向下，向左，向上
    列的方向数组 int[] dc = {1, 0, -1, 0} 向右，向下，向左，向上
    方向数组，代表下次移动时行或列 在数组下的索引变化。
    有了方向向量，还需要有个二维数组记录已经遍历过的元素坐标 (row，column) ，如果遍历过，该坐标对应的值就是 true
     */
    public static List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {return null;}
        int row = matrix.length;
        int col = matrix[0].length;
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        List<Integer> result = new ArrayList<>(row*col);
        boolean[][] iteration = new boolean[row][col];
        // di 表示row迭代的索引，dj 表示col迭代的索引
        int r =0, c = 0, di = 0;
        //按照迭代顺序，可以计算迭代次数为 row*col
        for (int i=0; i< row*col; i++) {
            result.add(matrix[r][c]);
            iteration[r][c] = true;

            // 下一步移动的候选位置
            int nr = r + dr[di];
            int nc = c + dc[di];

            // 做边界与是否已经访问过的判断
            if (nr >= 0 && nr < row && nc >= 0 && nc < col && !iteration[nr][nc]) {
                r = nr;
                c = nc;
            } else {
                // 说明到了边界了，需要换方向了
                di = (di + 1) % 4;
                r = r + dr[di];
                c = c + dc[di];
            }
        }

        return result;
    }

    /*
    方法 2：按层（圈）遍历
    把这个矩阵像剥洋葱似的一层一层的剥开，从最外层一直到最里层，我们通过示例图看下流程
    [
        [1,2,3],
        [4,5,6],
        [7,8,9]
    ]
    第一层 1 2 3 6 9 8 7 4
    第二层 5
    第一层的上面边 1 2 3，列坐标 column 从 columnMin 到 columnMax
    第一层的右面边 6 9， 行坐标 row 从 rowMin + 1 到 rowMax
    第一层的下面边 8 7， 列坐标 column 从 columnMax-1 到 columnMin
    第一层的左面边 4，  行坐标 row 从 rowMax - 1 到 rowMin + 1
    第二层的上面边 5， 列坐标 column 从 columnMin 到 columnMax （此时 columnMin == columnMax）
    值得需要注意的一点是对当前层是否有 4 条边的判断即 rowMin < rowMax && columnMin < columnMax，如果不满足就表示当前层没有 4 条边，就不需要遍历下面边和左面边
     */
    public static List<Integer> spiralOrder2(int[][] matrix) {
        if (matrix.length == 0) {
            return new ArrayList();
        }
        // rowMin 表示当前层行的最小下标 rowMax 表示当前层行的最大下标
        int rowMin = 0, rowMax = matrix.length - 1;
        // columnMin 表示当前层列的最小下标 columnMax 表示当前层列的最大下标
        int columnMin = 0, columnMax = matrix[0].length - 1;
        // (rowMin,columnMin) 代表当前层的左上角的坐标  (rowMax,columnMax) 表示当前层右下角的坐标
        List result = new ArrayList(matrix.length * matrix[0].length);

        while (rowMin <= rowMax && columnMin <= columnMax) {
            // 遍历当前层的上面边的所有元素 行坐标不变，列坐标 column 从 columnMin 到 columnMax
            for (int column = columnMin; column <= columnMax; column++) {
                result.add(matrix[rowMin][column]);
            }
            // 遍历当前层的右面边的所有元素 列坐标不变，行坐标 row 从 rowMin + 1 到 rowMax
            for (int row = rowMin + 1; row <= rowMax; row++) {
                result.add(matrix[row][columnMax]);
            }
            // 如果当前层有 4 条边即满足条件 rowMin < rowMax && columnMin < columnMax，还要遍历下面边和左面边的所有元素
            if (rowMin < rowMax && columnMin < columnMax) {
                // 遍历当前层的下面边的所有元素 行坐标不变，列坐标从 columnMax -1 到 columnMin
                for (int column = columnMax - 1; column >= columnMin; column--) {
                    result.add(matrix[rowMax][column]);
                }
                // 遍历当前层左面边的所有元素 列坐标不变，行坐标从 rowMax -1  遍历到 rowMin + 1
                for (int row = rowMax - 1; row > rowMin; row--) {
                    result.add(matrix[row][columnMin]);
                }
            }
            // 遍历一层后，遍历下一层，需要更新 rowMin、rowMax、columnMin、columnMax 的坐标
            rowMin++;
            rowMax--;
            columnMin++;
            columnMax--;
        }
        return result;
    }


}
