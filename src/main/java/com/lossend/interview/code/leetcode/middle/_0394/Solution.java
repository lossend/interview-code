package com.lossend.interview.code.leetcode.middle._0394;

import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Solution {
    public String decodeString(String s) {
        int sStart = -1;
        int iStart = -1;
       Deque<Integer> iStack = new LinkedList<>();
        Deque<String> sStack = new LinkedList<>();;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                if (sStart != -1) {
                    sStack.push(s.substring(sStart, i));
                    sStart = -1;
                }
               if (iStart < 0) {
                   iStart = i;
               }
            } else if ('['== s.charAt(i)) {
                int n = Integer.parseInt(s.substring(iStart, i));
                iStack.push(n);
                sStack.push("[");
                iStart = -1;
            } else if (']' == s.charAt(i)) {
                int n = iStack.pop();
                if (sStart != -1) {
                    sStack.push(s.substring(sStart, i));
                    sStart = -1;
                }
                StringBuilder builder = new StringBuilder();
                while (!sStack.isEmpty()) {
                    String tmp = sStack.pop();
                    if (tmp .equals( "[")) {
                        break;
                    }
                    builder.insert(0, tmp);
                }
                String repeat = builder.toString();
                builder = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    builder.append(repeat);
                }
                sStack.push(builder.toString());
            } else {
                if (sStart == -1) {
                    sStart = i;
                }
            }
        }
        if (sStart >= 0) {
            sStack.push(s.substring(sStart, s.length()));
        }
        StringBuilder builder = new StringBuilder();
        while (!sStack.isEmpty()) {
            builder.append(sStack.removeLast());
        }
        return builder.toString();
    }
}
