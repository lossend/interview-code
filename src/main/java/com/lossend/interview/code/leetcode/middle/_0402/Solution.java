package com.lossend.interview.code.leetcode.middle._0402;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    /**
     * 单调栈实现
     * @param num
     * @param k
     * @return
     */
    public String removeKdigits(String num, int k) {
        if (num.length() == k) {
            return "0";
        }
        if (k == 0) {
            return num;
        }
        StringBuilder builder = new StringBuilder();
        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            while (!deque.isEmpty() && k > 0) {
                Character p = deque.peek();
                if (p > c) {
                    deque.pop();
                    k--;
                } else {
                    break;
                }
            }
            deque.push(c);
        }
        while (k-- > 0) {
            deque.poll();
        }
        while (!deque.isEmpty() && deque.peekLast() == '0') {
            deque.pollLast();
        }
        while (!deque.isEmpty()) {
            builder.append(deque.pollLast());
        }
        return builder.length() == 0 ? "0": builder.toString();
    }
    /**
     * 暴力破解二
     * @param num
     * @param k
     * @return
     */
    public String removeKdigits1(String num, int k) {
        if (num.length() == k) {
            return "0";
        }
        if (k == 0) {
            return num;
        }
        char[] chars = num.toCharArray();
        StringBuilder builder = new StringBuilder();
        int start = 0;
        int end = start+k;
        while (k > 0 && start < chars.length) {
            int i = start;
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            while (i < chars.length  &&  i < end+1) {
                int n = chars[i] - '0';
                if (n < min)  {
                    min = n;
                    minIndex = i;
                }
                i++;
            }
            builder.append(min);
            k -= minIndex - start;
            start = minIndex + 1;
            end = start + k;
        }
        while (start < chars.length) {
                builder.append(chars[start]);
            start++;
        }
        if (k > 0) {
            builder.delete(builder.length()-k, builder.length());
        }
        while(builder.length() > 1 &&  builder.charAt(0) == '0') {
            builder.deleteCharAt(0);
        }
        if (builder.length() == 0) {
            return "0";
        }
        return builder.toString();
    }

    /**
     * 回溯
     * @param num
     * @param k
     * @return
     */
    public String removeKdigits2(String num, int k) {
        if (num.length() == k) {
            return "0";
        }
        char[] chars = num.toCharArray();
        int min =  dfs(chars, 0, 0, chars.length-k, 0);
        return "" + min;
    }

    public int dfs(char[] chars, int index, int currSize,int needSize,int sum)  {

        if (currSize == needSize) {
            return sum;
        }
        if (index >= chars.length) {
            return Integer.MAX_VALUE;
        }
        int min = Integer.MAX_VALUE;
        for (int i = index; i < chars.length ; i++) {
           int next = sum * 10 + chars[i] - '0';
           int num = dfs(chars, i+1, currSize+1, needSize, next) ;
           min = Math.min(min, num);
        }
        return min;
    }
}
