package com.lossend.interview.code.leetcode.middle._0240;

public class Solution {
    /**
     * 横列和纵列都采用二分查找定位
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n - 1;
        while (i <m && j>=0) {
            int left = leftBound(matrix[i], 0, j+1, target);
            if (left < j+1 && matrix[i][left] == target) {
                return true;
            }
            j = left - 1;
            if (j < 0) {
                return false;
            }
            left = i;
            int right = m;
            while (left < right) {
                int middle = left + (right - left) / 2;
                if (matrix[middle][j] > target) {
                    right = middle;
                } else {
                    left = middle+1;
                }
            }
            if (right - 1 >= 0 && matrix[right-1][j] == target) {
                return true;
            }
            i = right;
            j = j-1;
        }
        return false;
    }

    private int leftBound(int[] nums, int left, int right, int target) {
        while (left < right) {
            int m = left + (right - left) / 2;
            if (nums[m] >= target) {
                right = m;
            } else {
                left = m+1;
            }
        }
        return left;
    }
}
