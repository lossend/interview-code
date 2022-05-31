package com.lossend.interview.code.leetcode.middle._0621;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {
    class Task {
        char c;
        int count;
        int lastIndex;
    }

    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> counter = new HashMap<>();
        int maxCount = 0;
        for (char c : tasks) {
            int curr = counter.getOrDefault(c, 0);
            int count = curr + 1;
            counter.put(c, count);
            if (maxCount < count) {
                maxCount = count;
            }
        }
        int size = 0;
        for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
            if (entry.getValue() == maxCount) {
                size++;
            }
        }
        return Math.max(tasks.length, (maxCount - 1) * (n + 1) + size);
    }

    public int leastInterval2(char[] tasks, int n) {
        int step = 0;
        Map<Character, Integer> counter = new HashMap<>();
        PriorityQueue<Solution.Task> queue = new PriorityQueue<>((x, y) -> y.count - x.count);
        PriorityQueue<Task> delayQue = new PriorityQueue<>(Comparator.comparingInt(x -> x.lastIndex));

        for (char c : tasks) {
            if (counter.containsKey(c)) {
                counter.put(c, counter.get(c) + 1);
            } else {
                counter.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
            Task t = new Task();
            t.count = entry.getValue();
            t.c = entry.getKey();
            queue.offer(t);
        }
        while (!queue.isEmpty() || !delayQue.isEmpty()) {
            while (!delayQue.isEmpty()) {
                Task t = delayQue.peek();
                if (step >= t.lastIndex) {
                    t.lastIndex = -1;
                    delayQue.poll();
                    queue.add(t);
                } else if (queue.isEmpty()) {
                    step = t.lastIndex;
                } else {
                    break;
                }
            }
            if (!queue.isEmpty()) {
                Task t = queue.poll();
                t.count--;
                t.lastIndex = step + n + 1;
                if (t.count > 0) {
                    delayQue.offer(t);
                }
            }
            step++;
        }
        return step;
    }
}
