package com.lossend.interview.code.leetcode.easy._0003;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     * 3. Longest Substring Without Repeating Characters
     */
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int distance = 0;
        int i = 0;
        for (int j = i; j < s.length(); j++) {
            Integer idx = map.remove(s.charAt(j));
            map.put(s.charAt(j), j);
            if (idx != null && idx >= i) {
                if (distance > maxLength) {
                    maxLength = distance;
                }
                i = idx + 1;
                distance = j - i + 1;
            } else {
                distance += 1;
            }
        }
        if (distance > maxLength) {
            maxLength = distance;
        }
        return maxLength;
    }
}
