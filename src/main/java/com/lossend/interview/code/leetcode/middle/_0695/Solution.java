package com.lossend.interview.code.leetcode.middle._0695;

public class Solution {
    private int islandArea = 0;

    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2 || grid[i][j] == 0) {
                    continue;
                }
                islandArea = 0;
                dfs(grid, i, j);
                if (maxArea < islandArea) {
                    maxArea = islandArea;
                }
            }
        }
        return maxArea;
    }

    public void dfs(int[][] grid, int x, int y) {
        if (grid[x][y] == 2 || grid[x][y] == 0) {
            return;
        }
        grid[x][y] = 2;
        this.islandArea++;
        if (x+1 < grid.length) {
            dfs(grid, x+1, y);
        }
        if (x-1 >= 0) {
            dfs(grid, x-1, y);
        }
        if (y+1 < grid[0].length) {
            dfs(grid, x, y+1);
        }
        if (y-1 >= 0) {
            dfs(grid, x, y-1);
        }
    }
}
