package com.lossend.interview.code.leetcode.middle._0475;

import java.util.Arrays;

public class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int max = 0;
        int j = 0;
        Arrays.sort(houses);
        Arrays.sort(heaters);
        for (int i = 0; i < houses.length; i++) {
            // 上一个house的最佳位置，是这个house的起点，因为再之前的位置肯定没有当前位置优
            while (j < heaters.length) {
                if (heaters[j] - houses[i]>= 0 ) {
                    break;
                }
                j++;
            }
            int d1 = j < heaters.length ? heaters[j]-houses[i] : Integer.MAX_VALUE;
            int d2 =  j >= 1 ? Math.abs(heaters[j-1]- houses[i]): Integer.MAX_VALUE;
            int min = Math.min(d1, d2);
            max = Math.max(max, min);
        }
        return max;
    }
}
