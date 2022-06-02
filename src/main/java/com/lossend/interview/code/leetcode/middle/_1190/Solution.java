package com.lossend.interview.code.leetcode.middle._1190;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public String reverseParentheses(String s) {
        Deque<Integer> indexStack = new LinkedList<>();
        char[] buff = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            buff[i] = c;
            if (c == '(') {
                indexStack.push(i);
            } else if (c == ')') {
                int l = indexStack.pop();
                int r = i;
                revertBuf(buff, l, r);
            }
        }
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
           if (buff[i] != '(' && buff[i] != ')')  {
               buff[j] = buff[i];
               j++;
           }
        }
        return new String(buff, 0, j);
    }
    public void revertBuf(char[] buf, int l, int r) {
       while (l < r)  {
           char tmp = buf[l];
           buf[l] = buf[r];
           buf[r] = tmp;
           l++;
           r--;
       }
    }
}
