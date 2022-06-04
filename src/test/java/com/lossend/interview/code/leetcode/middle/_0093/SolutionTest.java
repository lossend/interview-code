package com.lossend.interview.code.leetcode.middle._0093;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void restoreIpAddresses() {
        assertEquals(List.of("1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3"), new Solution().restoreIpAddresses("101023"));
        assertEquals(List.of("255.255.11.135","255.255.111.35"), new Solution().restoreIpAddresses("25525511135"));
        assertEquals(List.of("0.0.0.0"), new Solution().restoreIpAddresses("0000"));
    }
}