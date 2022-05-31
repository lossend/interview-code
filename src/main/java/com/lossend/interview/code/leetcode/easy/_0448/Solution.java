package com.lossend.interview.code.leetcode.easy._0448;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * 解体思路，用一个长度为n的数组记录出现的数字
     * 为了压缩空间复杂度为O(1)，将数据记录在原数组上，出现的位置+n，num[num[i]] += n > n 表示出现过
     *
     * @param nums
     * @return
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int num = (nums[i] - 1) % n;
            nums[num] += n;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= n) {
                result.add(i + 1);
            }
        }
        return result;
    }
}
