package com.lossend.interview.code.leetcode.middle._0039;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> combine = new ArrayList<>();
        List<List<Integer>> total = new ArrayList<>();
        backtrace(candidates, target, 0,combine, total);
        return total;
    }

    public void backtrace(int[] candidates, int target, int index,List<Integer> combine, List<List<Integer>> total) {
        if (target < 0) {
            return;
        }
       if (combine.size() > 0 && target == 0)  {
           total.add(new ArrayList<>(combine));
           return;
       }
        for (int i = index; i < candidates.length; i++) {
            int num = candidates[i];
            int remain = target - num;
            if (remain < 0) {
                return;
            }
            combine.add(num);
            backtrace(candidates, remain, i,combine, total);
            combine.remove(combine.size()-1);
        }
    }
}
