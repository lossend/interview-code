package com.lossend.interview.code.leetcode.middle._698;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void canPartitionKSubsets() {
        assertEquals(true, new Solution().canPartitionKSubsets(new int[] {1,1,1,1,2,2,2,2 }, 4));
        assertEquals(true, new Solution().canPartitionKSubsets(new int[] {1,1,2,2}, 2));
        assertEquals(true, new Solution().canPartitionKSubsets(new int[] {4, 3, 2, 3, 5, 2, 1}, 4));
        assertEquals(false, new Solution().canPartitionKSubsets(new int[] {1,2,3,4}, 3));
    }
}