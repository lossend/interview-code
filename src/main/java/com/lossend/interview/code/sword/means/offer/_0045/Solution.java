package com.lossend.interview.code.sword.means.offer._0045;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Solution {
    public String minNumber(int[] nums) {
        return Arrays.stream(nums).boxed().sorted(this::compare).map(String::valueOf).collect(Collectors.joining());
    }

    public int compare(int x, int y) {
        int xn = 10;
        while (xn <= x) {
            xn *= 10;
        }
        int yn = 10;
        while (yn <= y) {
            yn *= 10;
        }
        return  (yn * x + y) - (xn * y + x) ;
    }
}
