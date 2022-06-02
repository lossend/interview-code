package com.lossend.interview.code.leetcode.middle._0200;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void numIslands() {
        char[][] grid4 = {
                {'1','0','1','1','1'},
                {'1','0','1','0','1'},
                {'1','1','1','0','1'}
        };
        assertEquals(1, new Solution().numIslands(grid4));

        char [][] grid3 = {{'1','1','1'},{'0','1','0'},{'1','1','1'}};
        assertEquals(1, new Solution().numIslands(grid3));
        char[][] grid = {
  {'1','1','1','1','0'},
  {'1','1','0','1','0'},
  {'1','1','0','0','0'},
  {'0','0','0','0','0'}
};
        assertEquals(1, new Solution().numIslands(grid));
        char[][] grid2 = {
                {'1','1','0','0','0'},
  {'1','1','0','0','0'},
  {'0','0','1','0','0'},
  {'0','0','0','1','1'}

        };
        assertEquals(3, new Solution().numIslands(grid2));
    }
}