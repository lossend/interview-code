package com.lossend.interview.code.sword.means.offer._0034;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<Integer> candidates = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        findSumPath(root, target, 0, candidates, result);
        return result;
    }
    public void findSumPath(TreeNode root, int target,int sum,List<Integer> candidates,List<List<Integer>> result) {
        if (root == null ) {
            return;
        }
        sum += root.val;
        candidates.add(root.val);
        if (root.left == null && root.right == null && sum == target) {
            result.add(new ArrayList<>(candidates));
        }
        findSumPath(root.left, target, sum, candidates, result);
        findSumPath(root.right, target, sum, candidates, result);
        candidates.remove(candidates.size()-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        List<Integer> treeList = new ArrayList<>();
        String line = scanner.nextLine();
        line = line.trim();
        String[] strArray= line.split(",");
        for (int i = 0;i < strArray.length; i++) {
            Integer num = Integer.valueOf(strArray[i]);
            treeList.add(num);
        }
        List<List<Integer>> result = new Solution().pathSum(TreeNode.buildTree(treeList.toArray(new Integer[0])), target);
        System.out.println(result);
    }
}
