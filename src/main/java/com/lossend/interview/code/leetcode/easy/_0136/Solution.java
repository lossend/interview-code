package com.lossend.interview.code.leetcode.easy._0136;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int singleNumber(int[] nums) {
        int n = 0;
        for (int num : nums) {
            n ^= num;

        }
        return n;
    }

    public int singleNumber2(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int num : nums) {
            Integer count = counter.get(num);
            if (count == null) {
                count = 1;
            } else {
                count += 1;
            }
            counter.put(num, count);
        }
        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
