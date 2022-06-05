package com.lossend.interview.code.leetcode.middle._0017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static Map<Character, String> digitMap = new HashMap<>();
    static {
        digitMap.put('2', "abc");
        digitMap.put('3', "def");
        digitMap.put('4', "ghi");
        digitMap.put('5', "jkl");
        digitMap.put('6', "mno");
        digitMap.put('7', "pqrs");
        digitMap.put('8', "tuv");
        digitMap.put('9', "wxyz");
    }
    public List<String> letterCombinations(String digits) {
        StringBuilder builder = new StringBuilder();
        List<String> total = new ArrayList<>();
        backtrace(digits, 0, builder, total);
        return  total;
    }

    public void backtrace(String digits, int index, StringBuilder builder, List<String> total) {
        if (index == digits.length() ) {
            if (builder.length() > 0) {
                total.add(builder.toString());
            }
            return;
        }
        char c = digits.charAt(index);
        String alpha = digitMap.get(c);
        for (int i = 0; i < alpha.length(); i++) {
            builder.append(alpha.charAt(i));
            backtrace(digits, index+1, builder, total);
            builder.deleteCharAt(index);
        }
    }
}
