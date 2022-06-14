package com.lossend.interview.code.leetcode.middle._0078;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> candidate = new ArrayList<>();
        List<List<Integer>> total = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        for (int i = 0; i <= nums.length; i++) {
           backtrace(nums, 0, i, visited, candidate, total);
        }
        return total;
    }
    private void backtrace(int[] nums, int start, int need, boolean[] visited, List<Integer> candidate, List<List<Integer>> total) {
        if (need == 0) {
            total.add(new ArrayList<>(candidate));
            return;
        }
        for (int i = start; i < nums.length ; i++) {
           if (visited[i] || (i > 0 && !visited[i-1] && nums[i-1] == nums[i])) {
              continue;
           }
           visited[i] = true;
           candidate.add(nums[i]);
           backtrace(nums, i+1, need-1, visited, candidate, total);
            candidate.remove(candidate.size()-1);
           visited[i] = false;
        }
    }
}
