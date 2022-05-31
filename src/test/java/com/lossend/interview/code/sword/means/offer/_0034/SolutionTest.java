package com.lossend.interview.code.sword.means.offer._0034;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void pathSum() {
        System.setIn(new ByteArrayInputStream("22 10,5,12,4,7".getBytes()));
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
        List<List<Integer>> expect = List.of(List.of(10, 5, 7), List.of(10, 12));
        assertEquals(expect, result);
        result = new Solution().pathSum(TreeNode.buildTree(List.of(1,2).toArray(new Integer[0])), 1);
        expect = List.of();
        assertEquals(expect, result);
        result = new Solution().pathSum(TreeNode.buildTree(List.of(1).toArray(new Integer[0])), 1);
        expect = List.of(List.of(1));
        assertEquals(expect, result);
    }
}