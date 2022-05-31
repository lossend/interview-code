package com.lossend.interview.code.leetcode.hard._0076;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> counter = new HashMap<>();
        int left = 0;
        int right = 0;
        int minLength = s.length() + 1;
        int start = -1;
        // 统计需要哪些字符，每个字符数量
        for (char c : t.toCharArray()) {
            int count = need.getOrDefault(c, 0);
            need.put(c, count + 1);
        }

        int matchSize = 0;
        while (right < s.length()) {
            // 滑动窗口向右移动
            char c = s.charAt(right);
            int count = counter.getOrDefault(c, 0);
            count++;
            // 滑动窗口内每个字符的个数
            counter.put(c, count);
            int needCount = need.getOrDefault(c, 0);
            // 如果当前字符的个数满足匹配所需的字符个数，记下这个字符匹配成功
            if (count == needCount) {
                matchSize++;
            }
            right++;
            // 当所有字符的匹配成功时，滑动窗口收缩
            if (matchSize == need.size()) {
                while (left < right) {
                    c = s.charAt(left);
                    needCount = need.getOrDefault(c, 0);
                    count = counter.getOrDefault(c, 0);
                    count--;
                    counter.put(c, count);
                    left++;
                    if (count < needCount) {
                        matchSize--;
                        if (right - left + 1 < minLength) {
                            minLength = right - left + 1;
                            start = left - 1;
                        }
                        break;
                    }
                }
            }
        }
        return start >= 0 ? s.substring(start, start + minLength) : "";
    }
}
