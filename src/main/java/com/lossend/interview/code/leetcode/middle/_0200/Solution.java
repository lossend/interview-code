package com.lossend.interview.code.leetcode.middle._0200;

public class Solution {
    public int numIslands(char[][] grid) {
        int islandSize = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '0' || grid[i][j] == '2') {
                    continue;
                }
                dfs(grid, i, j, m, n);
                islandSize++;
            }
        }
        return islandSize;
    }

    public void dfs(char[][] grid, int x, int y, int m, int n) {
        if (grid[x][y] == '0' || grid[x][y] == '2') {
            return;
        }
        grid[x][y] = '2';
        if (x+1 < m) {
            dfs(grid, x+1, y, m, n);
        }
        if (x-1 >= 0) {
            dfs(grid, x-1, y, m, n);
        }
        if (y+1 < n) {
            dfs(grid, x, y+1, m, n);
        }
        if (y-1 >= 0) {
            dfs(grid, x, y-1, m,n);
        }
    }
}
