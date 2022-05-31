package com.lossend.interview.code.leetcode.middle._0134;

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int length = gas.length;
        for (int i = 0; i < length; ) {
            int remain = 0;
            boolean find = true;
            int cnt = 0;
            int n = i;
            while (cnt < length) {
                remain += gas[n] - cost[n];
                if (remain < 0) {
                    find = false;
                    i += cnt + 1;
                    break;
                }
                cnt++;
                n = (i + cnt) % length;
            }
            if (find) {
                return i;
            }
        }
        return -1;
    }
}
