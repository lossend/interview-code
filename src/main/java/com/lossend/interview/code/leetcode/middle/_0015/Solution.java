package com.lossend.interview.code.leetcode.middle._0015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    /**
     * 排序+双指针
     *
     * @param nums
     * @return
     */

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 3) {
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int target = -nums[i];
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                if (l != i + 1 && nums[l] == nums[l - 1]) {
                    l++;
                    continue;
                }
                if (r != nums.length - 1 && nums[r] == nums[r + 1]) {
                    r--;
                    continue;
                }
                int sum = nums[l] + nums[r];
                if (sum < target) {
                    l++;
                } else if (sum > target) {
                    r--;
                } else {
                    result.add((Arrays.asList(nums[i], nums[l], nums[r])));
                    l++;
                    r--;
                }
            }
        }
        return result;
    }

    /**
     * 回溯法，超时了
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> candidate = new LinkedList<>();
        boolean[] visit = new boolean[nums.length];
        Arrays.sort(nums);
        backSum(nums, 0, 0, visit, result, candidate);
        return result;
    }

    /**
     * 暴力破解法
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum3(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                for (int k = j + 1; k < nums.length; k++) {
                    if (k > j + 1 && nums[k] == nums[k - 1]) {
                        continue;
                    }
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        result.add(List.of(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }
        return result;
    }

    public void backSum(int[] nums, int idx, int sum, boolean[] visit, List<List<Integer>> total, LinkedList<Integer> candidate) {
        if (candidate.size() == 3) {
            if (sum == 0) {
                total.add(new ArrayList<>(candidate));
            }
            return;
        }
        for (int i = idx; i < nums.length; i++) {
            /**
             * 相同数字序列段的前被访问时，后续有一个才能访问，保证访问相同序列个数的情况只能是一种
             */
            if (visit[i] || (i > 0 && (nums[i] == nums[i - 1]) && (!visit[i - 1]))) {
                continue;
            }
            visit[i] = true;
            candidate.add(nums[i]);
            backSum(nums, i + 1, sum - nums[i], visit, total, candidate);
            candidate.removeLast();
            visit[i] = false;
        }
    }
}
