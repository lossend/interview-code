package com.lossend.interview.code.leetcode.middle._0820;

import java.util.*;

public class Solution {
    public class TrieNode {
        char c;
        Map<Character,TrieNode> children;
        String word;
        public TrieNode(char c) {
            this.c = c;
        }
        public TrieNode insert(String s) {
            TrieNode r = this;
            for (int i = s.length()-1; i >= 0; i--) {
                char c = s.charAt(i);
                if (r.children == null) {
                    r.children = new HashMap<>();
                }
                r = r.children.computeIfAbsent(c, (k) -> new TrieNode(c));
            }
            r.word = s;
            return r;
        }
        public boolean isLeaf() {
            if (this.children == null || this.children.isEmpty()) {
                return true;
            }
            return false;
        }
        public void getLeaf(List<TrieNode> leaves) {
            if (this.children == null || this.children.isEmpty()) {
                leaves.add(this);
                return;
            }
            for (TrieNode child: this.children.values()) {
                child.getLeaf(leaves);
            }
        }
    }
    public int minimumLengthEncoding(String[] words) {
        TrieNode root = new TrieNode(' ');
        Set<TrieNode> cd = new HashSet<>();
        for (String word :
                words) {
           TrieNode n = root.insert(word);
           cd.add(n);
        }
        int sum = 0;
        for (TrieNode leaf :
                cd) {
            if (leaf.isLeaf()) {
                sum += leaf.word.length() + 1;
            }
        }
        return sum;
    }
}
