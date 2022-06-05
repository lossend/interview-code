package com.lossend.interview.code.leetcode.middle._0547;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Solution {
    public int findCircleNum(int[][] isConnected) {
        int m = isConnected.length;
        int n = isConnected[0].length;
        int size = Math.max(m, n);
        boolean[] visited = new boolean[size];
        int city = 0;
        for (int i = 0; i < m; i++) {
            if (visited[i]) {
                continue;
            }
            Deque<Integer> deque = new LinkedList<>();
            deque.push(i);
            city++;
            while (!deque.isEmpty()) {
                Integer curr  = deque.pop();
                for (int j = 0; j < n; j++) {
                    if (isConnected[curr][j] == 1 && !visited[j])  {
                        deque.push(j);
                        visited[j] = true;
                    }
                }
            }
        }
        return city;
    }
}
