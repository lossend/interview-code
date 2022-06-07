package com.lossend.interview.code.leetcode.middle._0316;

import java.util.*;

public class Solution {
    public String removeDuplicateLetters(String s) {
        Map<Character, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
           indexMap.put(s.charAt(i), i);
        }
        Deque<Character> deque = new LinkedList<>();
        Set<Character> stackSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (stackSet.contains(s.charAt(i))) {
                continue;
            }
            while (!deque.isEmpty()) {
                Character top = deque.peekLast();
                if (top > s.charAt(i)) {
                    Integer lastIndex = indexMap.get(top);
                    if (lastIndex == null || i > lastIndex) {
                        break;
                    } else {
                        deque.removeLast();
                        stackSet.remove(top);
                    }
                } else {
                    break;
                }
            }
            deque.addLast(s.charAt(i));
            stackSet.add(s.charAt(i));
        }
        StringBuilder builder = new StringBuilder();
        while (!deque.isEmpty()) {
            builder.append(deque.pollFirst());
        }
        return builder.toString();
    }
}
