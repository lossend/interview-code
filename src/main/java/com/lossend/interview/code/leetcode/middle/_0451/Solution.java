package com.lossend.interview.code.leetcode.middle._0451;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {
    public class Node {
        char c;
        int count;
        public Node(char c, int count) {
            this.c = c;
            this.count = count;
        }
    }
    public String frequencySort(String s) {
        Map<Character, Integer> counter = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            counter.put(s.charAt(i), counter.getOrDefault(s.charAt(i), 0) + 1);
        }
        PriorityQueue<Node> queue = new PriorityQueue<>((x, y)-> y.count - x.count);
        for (Map.Entry<Character, Integer> entry :
                counter.entrySet()) {
            queue.offer(new Node(entry.getKey(), entry.getValue()));
        }
        StringBuilder builder = new StringBuilder();
        while(!queue.isEmpty()) {
            Node n = queue.poll();
            for (int i = 0; i < n.count; i++) {
                builder.append(n.c);
            }
        }
        return builder.toString();
    }
}
