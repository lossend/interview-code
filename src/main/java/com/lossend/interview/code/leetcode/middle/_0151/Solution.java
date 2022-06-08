package com.lossend.interview.code.leetcode.middle._0151;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public String reverseWords(String s) {
        String[] parts = s.split(" ");
        List<String> words = new ArrayList<>(List.of(parts));
        Collections.reverse(words);
        return words.stream().filter(word -> word != null && !word.isEmpty()).collect(Collectors.joining(" " ));
    }
}
