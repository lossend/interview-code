package com.lossend.interview.code.leetcode.middle._0554;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void leastBricks() {
        assertEquals(2, new Solution().leastBricks(List.of(List.of(1,2,2,1), List.of(3,1,2), List.of(1,3,2), List.of(2, 4), List.of(3,1,2), List.of(1,3,1,1))));
        assertEquals(3, new Solution().leastBricks(List.of(List.of(10000000), List.of(10000000), List.of(10000000))));
    }
}