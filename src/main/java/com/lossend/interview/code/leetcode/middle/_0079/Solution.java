package com.lossend.interview.code.leetcode.middle._0079;

public class Solution {
    public boolean exist(char[][] board, String word) {
        char[] w = word.toCharArray();
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                boolean find = backtrace(board, i, j, w, 0, visited);
                if (find) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean backtrace(char[][] board, int x, int y, char[] w, int index, boolean[][] visited) {
        if (visited[x][y]) {
            return false;
        }
        if (w[index] != board[x][y]) {
            return false;
        }
        if (index == w.length - 1) {
            return true;
        }
        visited[x][y] = true;
        if (x - 1 >= 0) {
            boolean find = backtrace(board, x - 1, y, w, index+1, visited);
            if (find) {
                return true;
            }
        }
        if (y - 1 >= 0) {
            boolean find = backtrace(board, x , y - 1, w, index+1, visited);
            if (find) {
                return true;
            }
        }
        if (x + 1 < board.length) {
            boolean find = backtrace(board, x + 1, y, w, index+1, visited);
            if (find) {
                return true;
            }
        }
        if (y+1 < board[0].length) {
            boolean find = backtrace(board, x , y+1, w, index+1, visited);
            if (find) {
                return true;
            }
        }
        visited[x][y] = false;
        return false;
    }
}
