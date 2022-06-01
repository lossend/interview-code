package com.lossend.interview.code.leetcode.middle._698;

import java.util.*;

public class Solution {
    /**
     * 回溯法
     * @param nums
     * @param k
     * @return
     */
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum % k > 0) {
            return false;
        }
        int average = sum / k;
        Arrays.sort(nums);
        return canPartitionKSubsets(nums, k, average);
    }

    /**
     * 找多组这个
     * @param nums
     * @param used
     * @param k
     * @param remain
     * @return
     */
    public boolean canPartitionKSubsets(int[] nums,  int k, int remain) {
        LinkedList<Integer> candidate = new LinkedList<>();
        List<List<Integer>> total = new ArrayList<>() ;
        boolean[] used = new boolean[nums.length];
        findGroup(nums, used, 0,remain, candidate, total);
        if (total.size() < k) {
            return false;
        }
        used = new boolean[total.size()];
        Set<Integer> totalSet = new HashSet<>();
        return findKSubSets(total,k,  nums.length, 0,used, totalSet);
    }

    public boolean findKSubSets(List<List<Integer>> total, int k, int totalK, int l, boolean[] used, Set<Integer> totalSet) {
        if (k == 0) {
            return totalSet.size() == totalK;
        }

        for (int i = l; i < total.size(); i++) {
            if (used[i]) {
                continue;
            }
            boolean conflit = false;
            List<Integer> indexList = total.get(i);
            for (Integer idx: indexList) {
                if (totalSet.contains(idx)) {
                    conflit = true;
                    break;
                }
            }
            if (!conflit) {
                used[i] = true;
                totalSet.addAll(indexList);
                boolean find = findKSubSets(total, k - 1, totalK, i+1, used ,totalSet);
                if (find) {
                    return true;
                }
                totalSet.removeAll(indexList);
                used[i] = false;
            }
        }
        return false;
    }

    /**
     * 找一组指定和的数组
     * @param nums
     * @param used
     * @param sum
     * @param candidate
     * @return
     */
    public void findGroup(int[] nums, boolean[] used, int l, int sum, LinkedList<Integer> candidate, List<List<Integer>> total) {
        if (sum == 0) {
            total.add(new ArrayList<>(candidate));
            return;
        }
        for (int i = l; i < nums.length; i++) {
            if (used[i] ) {
                continue;
            }
            if (sum < nums[i]) {
                continue;
            }
            used[i] = true;
            candidate.addLast(i);
            findGroup(nums, used, i+1, sum - nums[i], candidate, total);
            candidate.removeLast();
            used[i] = false;
        }
    }
}
