package com.lossend.interview.code.leetcode.middle._0039._0130;

import com.lossend.interview.code.leetcode.middle._0130.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solve() {
        char[][] m1 = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        char[][] r1 = {{'X','X','X','X'},{'X','X','X','X'},{'X','X','X','X'},{'X','O','X','X'}};
        new Solution().solve(m1);
        assertArrayEquals(r1, m1);
    }
}