package com.lossend.interview.code.leetcode.middle._0567;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Solution {
    public boolean checkInclusion(String s2, String s1) {
        if (s1.length() < s2.length()) {
            return false;
        }
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, LinkedList<Integer>> indexMap = new HashMap<>();

        for (int i = 0; i < s2.length(); i++) {
            int count = need.getOrDefault(s2.charAt(i), 0);
            need.put(s2.charAt(i), ++count);
        }
        int left = -1;
        int right = 0;
        while (right < s1.length()) {
            char c = s1.charAt(right);
            if (need.containsKey(c)) {
                LinkedList<Integer> indexList = indexMap.getOrDefault(c, new LinkedList<>());
                indexList.offerLast(right);
                indexMap.put(c, indexList);
                int needCount = need.getOrDefault(c, 0);
                if (indexList.size() == needCount) {
                    if (right - left == s2.length()) {
                        return true;
                    }
                }
                if (needCount < indexList.size()) {
                    int start = left + 1;
                    left = indexList.pollFirst();
                    // 这里必须把之前的数据排除在滑动窗口中
                    for (int i = start; i < left; i++) {
                        LinkedList<Integer> l = indexMap.get(s1.charAt(i));
                        if (l == null) {
                            continue;
                        }
                        l.pollFirst();
                    }
                }
            } else {
                indexMap.clear();
                left = right;
            }
            right++;
        }
        return false;
    }
}
