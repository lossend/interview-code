package com.lossend.interview.code.leetcode.middle._0008;

public class Solution {
    public int myAtoi(String s) {
        int index = 0;
        while(index < s.length() && s.charAt(index) == ' ') {
            index++;
        }
        if (index == s.length()) {
            return 0;
        }
        int sign = 1;
        if (s.charAt(index) == '-') {
            sign = -1;
            index++;
        } else if (s.charAt(index) == '+') {
            index++;
        }
        while(index < s.length() && s.charAt(index) == '0') {
            index++;
        }
        int result = 0;
        char c ;
        while (index < s.length() && (c = s.charAt(index)) <= '9' && c >= '0') {
            int num = c - '0';
            if (((result * 10 + num) / 10) != result) {

                return sign > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + num;
            index++;
        }
        return  result * sign;
    }
}
