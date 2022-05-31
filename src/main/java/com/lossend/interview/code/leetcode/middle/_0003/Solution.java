package com.lossend.interview.code.leetcode.middle._0003;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> window = new HashMap<>();
        int l = 0;
        int r = 0;
        int maxLength = 0;
        while (r < s.length()) {
            char c = s.charAt(r);
            Integer old = window.put(c, r);
            if (old != null && old >= l) {
                int length = r - l;
                if (length > maxLength) {
                    maxLength = length;
                }
                l = old + 1;
            }
            r++;
        }
        if (maxLength < r - l) {
            maxLength = r - l;
        }
        return maxLength;
    }
}
