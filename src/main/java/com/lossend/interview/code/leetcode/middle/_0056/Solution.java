package com.lossend.interview.code.leetcode.middle._0056;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (x, y) -> x[0] - y[0]);
        List<int[]> result = new ArrayList<>();
        int[] prev = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (prev[1] >= intervals[i][0]) {
               int[]  merge = new int[2];
               merge[1] = Math.max(prev[1], intervals[i][1]);
               merge[0] = prev[0];
               prev = merge;
            } else {
                result.add(prev);
                prev = intervals[i];
            }
        }
        result.add(prev);
        return result.toArray(new int[0][0]);
    }
}
