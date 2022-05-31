package com.lossend.interview.code.leetcode.hard._0004;

public class Solution {
    /**
     * 思路: 寻找两个数组的分割线，这个分割线满足两个条件：
     * 1. 左边元素个等于右边元素
     * 2. 第一个数组左边元素的最大值要小于第二个右边元素的最小值
     * 3. 第一个数组右边元素的最小值要大于第二个元素左边的最大值
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int leftSize = (nums2.length + nums1.length + 1) / 2;
        // 保证第一个数组长度小于第二个数组
        if (nums1.length > nums2.length) {
            int[] tmp = nums1;
            nums1 = nums2;
            nums2 = tmp;
        }

        int left = 0;
        int right = nums1.length;
        while (left < right) {
            // i表示第一个数组分割线的左边第一个位置
            int i = left + (right - left + 1) / 2;
            int j = leftSize - i;
            if (nums1[i - 1] > nums2[j]) {
                // right应该是i的上限,i<= right
                // 此时不满足条件，那么这个上线可以是当前i-1
                right = i - 1;
            } else {
                left = i;
            }
        }
        int num1LeftMax = left != 0 ? nums1[left - 1] : Integer.MIN_VALUE;
        int num2LeftMax = left != leftSize ? nums2[leftSize - left - 1] : Integer.MIN_VALUE;
        int num1RightMin = right != nums1.length ? nums1[right] : Integer.MAX_VALUE;
        int num2RightMin = leftSize - left != nums2.length ? nums2[leftSize - left] : Integer.MAX_VALUE;
        int leftMax = Math.max(num1LeftMax, num2LeftMax);
        int rightMin = Math.min(num1RightMin, num2RightMin);
        return (nums1.length + nums2.length) % 2 == 1 ? leftMax : (leftMax + rightMin) / 2.0;
    }
}
