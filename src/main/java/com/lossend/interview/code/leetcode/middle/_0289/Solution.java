package com.lossend.interview.code.leetcode.middle._0289;

public class Solution {
    private  final int[][] next= {{0,0}, {1,1}, {1, 0}, {0,1}};
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               if (board[i][j] == 1) {
                   int count = liveSize(board, i, j);
                   if (count == 2 || count == 3) {
                       board[i][j] = 1;
                   } else {
                       board[i][j] = 2;
                   }
               } else {
                   int count = liveSize(board, i, j);
                   if (count == 3) {
                       board[i][j] = 3;
                   } else {
                       board[i][j] = 0;
                   }
               }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = next[board[i][j]][1];
            }
        }
    }
    private int liveSize(int[][] board, int x, int y) {
        int count = 0;
        int m = board.length;
        int n = board[0].length;
        if (x - 1 >= 0) {
            int state = board[x-1][y];
            int prev = next[state][0];
            count += prev;
        }
        if (x + 1 < m) {
            int state = board[x+1][y];
            int prev = next[state][0];
            count += prev;
        }
        if (y-1 >= 0) {
            int state = board[x][y-1];
            int prev = next[state][0];
            count += prev;
        }
        if (y + 1 < n) {
            int state = board[x][y+1];
            int prev = next[state][0];
            count += prev;
        }
        if (x - 1 >=0 && y-1 >= 0) {
            int state = board[x-1][y-1];
            int prev = next[state][0];
            count += prev;
        }
        if (x - 1 >=0 && y+1 < n) {
            int state = board[x-1][y+1];
            int prev = next[state][0];
            count += prev;
        }
        if (x + 1 < m && y-1 >= 0) {
            int state = board[x+1][y-1];
            int prev = next[state][0];
            count += prev;
        }
        if (x + 1 < m && y+1 < n) {
            int state = board[x+1][y+1];
            int prev = next[state][0];
            count += prev;
        }
        return count;
    }

}
