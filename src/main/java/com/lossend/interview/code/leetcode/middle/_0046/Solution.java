package com.lossend.interview.code.leetcode.middle._0046;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        LinkedList<Integer> candidate = new LinkedList<>();
        List<List<Integer>> total = new ArrayList<>();
        permute(nums, visited, candidate, total);
        return total;
    }

    public  void permute(int[] nums, boolean[] visited, LinkedList<Integer> candidate, List<List<Integer>> total) {
        if (candidate.size() == nums.length) {
            total.add(new ArrayList<>(candidate));
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue;
            }

            visited[i] = true;
            candidate.add(nums[i]);
            permute(nums, visited, candidate, total);
            candidate.removeLast();
            visited[i] = false;
        }
    }
}
