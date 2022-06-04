package com.lossend.interview.code.leetcode.middle._0179;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public String largestNumber(int[] nums) {
        List<String> numbers = Arrays.stream(nums).boxed().sorted(this::compare).map(String::valueOf).collect(Collectors.toList());
        if (numbers.get(0).equals("0")) {
            return "0";
        }
        return String.join("", numbers);
    }
    public int compare(int x, int y) {
        int sum1 = 10;
        while (sum1 <= x) {
            sum1 *= 10;
        }
        sum1 = sum1 * y + x;
        int sum2 = 10;
        while (sum2 <= y) {
            sum2 *= 10;
        }
        sum2 = sum2 * x + y;
        return sum1 - sum2;
    }

}
