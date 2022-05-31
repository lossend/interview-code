package com.lossend.interview.code.leetcode.middle._0438;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        Map<Character, Integer> need = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            int count = need.getOrDefault(c, 0);
            need.put(c, ++count);
        }

        List<Integer> result = new ArrayList<>();
        int matchSize = 0;
        int left = 0;
        int right = 0;
        Map<Character, Integer> window = new HashMap<>();
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;
            if (need.containsKey(c)) {
                int count = window.getOrDefault(c, 0);
                count++;
                window.put(c, count);
                int needCount = need.getOrDefault(c, 0);
                if (count == needCount) {
                    matchSize++;
                }
                while (matchSize == need.size() && left < right) {
                    if (right - left == p.length()) {
                        result.add(left);
                    }
                    c = s.charAt(left);
                    if (need.containsKey(c)) {
                        count = window.getOrDefault(c, 0);
                        needCount = need.getOrDefault(c, 0);
                        if (count == needCount) {
                            matchSize--;
                        }
                        count--;
                        window.put(c, count);
                    }

                    left++;
                }
            }

        }
        return result;
    }
}
