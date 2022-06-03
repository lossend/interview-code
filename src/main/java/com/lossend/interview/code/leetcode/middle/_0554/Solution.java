package com.lossend.interview.code.leetcode.middle._0554;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        int weight = wall.get(0).stream().reduce(0, Integer::sum);
        int height = wall.size();
        Map<Integer, Integer> counter = new HashMap<>();
        for (int i = 0; i < wall.size(); i++) {
            int index = 0;
            List<Integer> l = wall.get(i);
            for (int j = 0; j < l.size(); j++) {
                index += l.get(j);
                counter.computeIfAbsent(index, (x)-> 0);
               int count =  counter.computeIfPresent(index, (x, y)-> y+1);
            }
        }
        AtomicInteger max = new AtomicInteger(0);
        counter.forEach((k, v)-> {
            if (k == weight) {
                return;
            }
           if (v > max.intValue())  {
               max.set(v);
           }
        });
        return height - max.intValue();
    }
    /**
     * 暴力破解
     * @param wall
     * @return
     */
    public int leastBricks2(List<List<Integer>> wall) {
        int weight = wall.get(0).stream().reduce(0, Integer::sum);
        int height = wall.size();
        if (weight == 1) {
            return height;
        }
        int[][] p = new int[height][weight];
        for (int i = 0; i < height; i++) {
            int k = 0;
           for (Integer w: wall.get(i)) {
               for (int j = 1; j < w; j++) {
                   p[i][k+j]=1;
               }
               k += w;
           }
        }

        int minSize = height;
        for (int i = 1; i < weight; i++) {
            int sum = 0;
            for (int j = 0; j < height; j++) {
               sum += p[j][i];
            }
            if (sum < minSize) {
                minSize = sum;
            }
        }
        return minSize;
    }
}
