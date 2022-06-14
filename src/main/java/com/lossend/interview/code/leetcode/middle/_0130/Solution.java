package com.lossend.interview.code.leetcode.middle._0130;

import java.util.Arrays;

public class Solution {
    public class UnionFindSet {
        private  int[] parent;
        UnionFindSet(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }
        public int find(int node) {
            while (node != parent[node]) {
                parent[node] = parent[parent[node]];
                node = parent[node];
            }
            return node;
        }
        public void union(int x, int y) {
            int px = find(x);
            int py = find(y);
            parent[py] = px;
        }
    }
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        int head = -1;
        UnionFindSet set = new UnionFindSet(m * n);
        for (int i : Arrays.asList(0, m-1)) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 'O')  {
                    if (head == -1) {
                        head = i* n + j;
                    } else {
                        set.union(head, i*n+j);
                    }
                }
            }
        }
        for (int j:
             Arrays.asList(0, n-1)) {
            for (int i = 1; i < m-1; i++) {
                if(board[i][j] == 'O')  {
                    if (head == -1) {
                        head = i* n + j;
                    } else {
                        set.union(head, i*n+j);
                    }
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'X') {
                    continue;
                }
                if (i+1 < m && board[i+1][j] == 'O') {
                    set.union(i*n+j, (i+1)*n+j);
                }
                if (j+1 < n && board[i][j+1] == 'O') {
                    set.union(i*n+j, (i)*n+j+1);
                }
            }
        }
        int pH = head >= 0? set.find(head): -1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] != 'O') {
                    continue;
                }
                int p = set.find(i*n+j );
                if (p != pH) {
                    board[i][j] = 'X';
                }
            }
        }
    }
}
