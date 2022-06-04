package com.lossend.interview.code.leetcode.middle._0054;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        int[][] direct = {{1, 1}, {-1, 1}, {1, -1} , {-1, -1}};
        int change = 0;
        int d = direct[change % 4][0];
        int s = direct[change % 4][1];
        int x = 0;
        int y= 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < m * n; i++) {
            visited[x][y] = true;
            result.add(matrix[x][y]);
            int xn =  d > 0 ? x : x + s;
            int yn = d > 0 ? y + s: y;
            if (xn > m-1 || xn < 0 || yn <0 || yn > n-1 || visited[xn][yn]) {
                change++;
                d = direct[change % 4][0];
                s = direct[change % 4][1];
                xn =  d > 0 ? x : x + s;
                yn = d > 0 ? y + s: y;
            }
            x = xn;
            y = yn;
        }
        return result;
    }

}
