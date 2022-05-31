package com.lossend.interview.code.leetcode.easy._0047;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    /**
     * #47. Permutations II
     */
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] visit = new boolean[nums.length];
        List<List<Integer>> permutes = new ArrayList<>();
        LinkedList<Integer> permute = new LinkedList<>();
        Arrays.sort(nums);
        backTrace(0, nums, visit, permute, permutes);
        return permutes;
    }

    private static void backTrace(int idx, int[] nums, boolean[] visit, LinkedList<Integer> permute, List<List<Integer>> permutes) {
        if (idx == nums.length) {
            permutes.add(new ArrayList<>(permute));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            /**
             * 相同数字序列段的前被访问时，后续有一个才能访问，保证访问相同序列个数的情况只能是一种
             */
            if (visit[i] || (i > 0 && nums[i] == nums[i - 1] && !visit[i - 1])) {
                continue;
            }
            visit[i] = true;
            permute.addLast(nums[i]);
            backTrace(idx + 1, nums, visit, permute, permutes);
            permute.removeLast();
            visit[i] = false;
        }
    }
}
