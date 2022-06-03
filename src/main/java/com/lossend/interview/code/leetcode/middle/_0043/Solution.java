package com.lossend.interview.code.leetcode.middle._0043;

public class Solution {
    public String multiply(String num1, String num2) {
        int[] m = new int[num1.length()];
        int[] n = new int[num2.length()];
        int[] a = new int[m.length + n.length+1];
        if (m.length == 0 || n.length == 0) {
            return "";
        }
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        if (num1.equals("1")) {
            return num2;
        }
        if (num2.equals("1")) {
            return num1;
        }
        for (int i = 0 ; i <m.length ; i++) {
            m[i] = num1.charAt(m.length-i-1) -'0';
        }
        for (int i = 0 ; i <n.length ; i++) {
            n[i] = num2.charAt(n.length-i-1) - '0';
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < n.length; j++) {
                int x = m[i]  * n[j] + a[i+j];
                a[i+j] = x %  10;
                int y = a[i+j+1] + x/10;
                a[i+j+1] = y % 10;
                a[i+j+2] += y / 10;
            }
        }
        int k = a.length-1;
        while (a[k] == 0 && k > 0) {
            k--;
        }
        StringBuilder builder = new StringBuilder();
        while (k >=0) {
            builder.append(a[k]);
            k--;
        }
        return builder.toString();
    }
}
