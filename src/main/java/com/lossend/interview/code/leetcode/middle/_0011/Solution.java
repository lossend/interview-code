package com.lossend.interview.code.leetcode.middle._0011;

public class Solution {
    /**
     * 使用双指针，移动值小的那个；
     * 因为如果移动值大的那个指针，矩形的高度不会变大，而可能变小，而长度是变小的
     * 所以不可能会出现比当前面积大的情况
     *
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;
        while (l < r) {
            int h;
            int w = (r - l);
            if (height[l] > height[r]) {
                h = height[r];
                r--;
            } else {
                h = height[l];
                l++;
            }
            int area = w * h;
            if (area > max) {
                max = area;
            }
        }
        return max;
    }
}
