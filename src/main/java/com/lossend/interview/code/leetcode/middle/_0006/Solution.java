package com.lossend.interview.code.leetcode.middle._0006;

public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        char[][] matrix = new char[numRows][s.length()/2+1];
        boolean z = false;
        int x = 0;
        int y = 0;
        for (int i = 0; i < s.length(); i++) {
           matrix[x][y] = s.charAt(i);
           int xn = z ? x-1: x+1;
           int yn = z ? y+1: y;
           if (xn < 0 || xn >= numRows) {
               z = !z;
               xn = z ? x-1: x+1;
               yn = z ? y+1: y;
           }
           x = xn;
           y = yn;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
               if (matrix[i][j] != 0)  {
                  builder.append(matrix[i][j]);
               }
            }
        }
        return builder.toString();
    }
}
