package com.lossend.interview.code.leetcode.middle._0347;

import java.util.*;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            counter.put(nums[i], counter.getOrDefault(nums[i], 0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((x, y) -> {
            return  x.getValue() - y.getValue();
        });
        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            queue.offer(entry);
            if (queue.size() > k)  {
               queue.poll();
            }
        }
        int[] top = new int[k];
        for (int i = k-1; i >= 0; i--) {
           top[i] = queue.poll().getKey();
        }
        return top;
    }
}
