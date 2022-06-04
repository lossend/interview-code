package com.lossend.interview.code.leetcode.middle._0093;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<List<String>> total = new ArrayList<>();
        List<String> candidate = new ArrayList<>();
        findValidAddress(s, 0, 0, candidate, total);
        List<String> result = total.stream().map(l -> String.join(".", l)).collect(Collectors.toList());
        return result;
    }

    public void findValidAddress(String s, int first, int index, List<String> candidate, List<List<String>> total) {
        if (candidate.size() == 3) {
            String part = s.substring(first);
            if (isValidAddress(part)) {

                List<String> l = new ArrayList<>(candidate);
                l.add(part);
                total.add(l);
            }
            return;
        }
        int up = Math.min(s.length(), first+3);
        for (int i = first; i < up; i++) {
            String sub = s.substring(first, i+1);
            if (isValidAddress(sub)) {
                candidate.add(sub);
                findValidAddress(s, i+1, index+1, candidate, total);
                candidate.remove(candidate.size()-1);
            } else {
                break;
            }
        }
    }

    public boolean isValidAddress(String s) {
        if (s.length() > 3 || s.length() == 0) {
            return false;
        }
        if (s.length() > 1 && s.startsWith("0")) {
            return false;
        }
        try {
            return Integer.parseInt(s, 10) < 256 ;
        } catch (NumberFormatException e) {
        }
        return false;
    }
}
