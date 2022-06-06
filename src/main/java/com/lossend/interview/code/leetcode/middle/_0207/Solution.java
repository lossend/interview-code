package com.lossend.interview.code.leetcode.middle._0207;

import java.util.*;

public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, Set<Integer>> preReqMap = new HashMap<>();
        int[]  edge = new int[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            int p = prerequisites[i][0];
            int q = prerequisites[i][1];
            preReqMap.computeIfAbsent(q, (t)-> new HashSet<>());
            preReqMap.get(q).add(p);
            edge[p]++;
        }
        int visited = 0;
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (edge[i] == 0)  {
                deque.offer(i);
            }
        }
        while (!deque.isEmpty()) {
            int p = deque.poll();
            visited++;
            Set<Integer> set = preReqMap.get(p);
            if (set == null) {
                continue;
            }
            for (int q : set) {
                edge[q]--;
                if (edge[q] == 0) {
                    deque.offer(q);
                }
            }
        }
        return visited == numCourses;
    }
}
