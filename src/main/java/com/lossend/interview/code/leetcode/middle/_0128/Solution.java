package com.lossend.interview.code.leetcode.middle._0128;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
    class UnionSet {
        private int[] parent;

        public UnionSet(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }
        public int find(int x) {
            while (parent[x] != x) {
                parent[x] = parent[parent[x]];
                x =  parent[x];
            }
            return x;
        }
        public void union(int x, int y) {
            int px = find(x);
            int py = find(y);
            parent[px] = py;
        }
        public int maxSetSize() {
            int max= 0;
            Map<Integer, Integer> counter = new HashMap<>();
            for (int i = 0; i < parent.length; i++) {
                int p = find(i);
                counter.put(p, counter.getOrDefault(p, 0) + 1);
                if (max < counter.get(p)) {
                    max = counter.get(p);
                }
            }
            return max;
        }
    }
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        UnionSet set = new UnionSet(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                continue;
            }
           if (map.containsKey(nums[i] - 1))  {
               set.union(i, map.get(nums[i]-1));
           }
            if (map.containsKey(nums[i] + 1))  {
                set.union(i, map.get(nums[i]+1));
            }
            map.put(nums[i], i) ;
        }
        return set.maxSetSize();
    }
}
