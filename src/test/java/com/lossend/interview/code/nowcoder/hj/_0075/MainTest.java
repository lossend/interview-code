package com.lossend.interview.code.nowcoder.hj._0075;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void longestSubSeq() {
        assertEquals(6, Main.longestSeqNumber("asdfas", "werasdfaswer"));
        assertEquals(4, Main.longestSubSeq("addbbccaacbddbbb", "ddcddcbcdbcbbbdabdcddabddcadbbbbdddabacaadcdcaacd"));
    }
}