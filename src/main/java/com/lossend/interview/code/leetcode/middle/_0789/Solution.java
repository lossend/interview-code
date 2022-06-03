package com.lossend.interview.code.leetcode.middle._0789;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int i = 0; i < answers.length; i++) {
            counter.computeIfAbsent(answers[i], (k)-> 0);
            counter.computeIfPresent(answers[i], (k, v)-> v+1);
        }
        AtomicInteger c = new AtomicInteger();
        counter.forEach((k, v)-> {
            c.addAndGet ((v + k) / (k+1) * (k+1));
        });
        return c.intValue();
    }
}
