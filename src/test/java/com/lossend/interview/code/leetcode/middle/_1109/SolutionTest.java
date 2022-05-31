package com.lossend.interview.code.leetcode.middle._1109;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void corpFlightBookings() {
        int[] expect = new int[]{10, 55, 45, 25, 25};
        int[][] bookings = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        assertArrayEquals(expect,
                new Solution().corpFlightBookings(bookings, 5));
    }
}