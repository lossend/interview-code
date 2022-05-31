package com.lossend.interview.code.leetcode.middle._1094;

public class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int tripLength = 0;
        int[] diff = new int[1002];
        for (int i = 0; i < trips.length; i++) {
            int num = trips[i][0];
            int from = trips[i][1];
            int to = trips[i][2];
            diff[from] += num;
            diff[to] -= num;
            if (tripLength < to + 1) {
                tripLength = to + 1;
            }
        }
        int sum = 0;
        for (int i = 0; i < tripLength; i++) {
            sum += diff[i];
            if (sum > capacity) {
                return false;
            }
        }
        return true;
    }
}
