package com.lossend.interview.code.leetcode.middle._406;

import java.util.*;

public class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (x, y) -> {
            if (x[0] == y[0]) {
                return x[1] - y[1];
            } else {
                return x[0] - y[0];
            }
        });
        Map<Integer, Integer> counter = new HashMap<>();
        for (int i = 0; i < people.length; i++) {
            counter.computeIfAbsent(people[i][0], (k)-> 0);
            counter.computeIfPresent(people[i][0], (k, v)-> v+1);
        }
        for (int i = people.length-1; i >= 0; ) {
            int count = counter.getOrDefault(people[i][0], 0);
            for (int j = 0; j < count; j++) {
                int idx = people[i-j][1];
                int q = count - j - 1;
                int d = idx - q;
                if (d > 0) {
                   int start = i-j;
                   int end = start +d;
                   int[] tmp = people[i-j];
                   // 后移
                    for (int k =  start; k < end; k++) {
                        people[k] = people[k+1];
                    }
                    people[end] = tmp;
                }
            }
            i -= count;
        }
        return people;
    }
}
