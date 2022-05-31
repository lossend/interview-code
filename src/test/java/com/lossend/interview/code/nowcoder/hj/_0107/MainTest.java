package com.lossend.interview.code.nowcoder.hj._0107;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void cube2() {
        assertEquals("0.7", String.format("%.1f", Main.cube2(0.3D)));
        assertEquals("-0.7", String.format("%.1f", Main.cube2(-0.3D)));
        assertEquals("0.0", String.format("%.1f", Main.cube2(0)));
        assertEquals("2.7", String.format("%.1f", Main.cube2(19.9)));
        assertEquals("1.4", String.format("%.1f", Main.cube2(2.7)));
    }
}