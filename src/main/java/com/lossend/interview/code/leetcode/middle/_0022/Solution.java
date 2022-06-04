package com.lossend.interview.code.leetcode.middle._0022;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesis(n, n, "", result);
        return result;
    }

    public  void generateParenthesis(int l, int r, String sub, List<String> result) {
        if (l == 0 && r == 0) {
            result.add(sub);
            return;
        }
        if (l > 0) {
            generateParenthesis(l-1, r, sub+"(", result);
        }
        if (r > l) {
            generateParenthesis(l, r-1, sub+")", result);
        }
    }
}
