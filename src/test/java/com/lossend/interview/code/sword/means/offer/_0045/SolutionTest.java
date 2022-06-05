package com.lossend.interview.code.sword.means.offer._0045;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void minNumber() {

    }

    @Test
    void testMinNumber() {
        assertEquals("102", new Solution().minNumber(new int[]{10, 2}));
        assertEquals("3033459", new Solution().minNumber(new int[]{3,30,34,5,9}));
    }
}