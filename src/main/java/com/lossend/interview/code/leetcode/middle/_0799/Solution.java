package com.lossend.interview.code.leetcode.middle._0799;

import java.util.Arrays;

public class Solution {
    /**
     * 按照总的酒到每一层溢出的量计算
     * @param poured
     * @param query_row
     * @param query_glass
     * @return
     *
     */
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] layer = new double[query_row + 2][query_row+2];
        layer[0][0] = poured;
        for (int i = 0; i < query_row + 1; i++) {
            for (int j = 0; j < i + 1; j++) {
               double delta = (layer[i][j] - 1) / 2;
               if (delta > 0) {
                   layer[i+1][j] += delta;
                   layer[i+1][j+1] += delta;
               }
            }
        }
        return Math.min(1, layer[query_row][query_glass]);
    }

}
