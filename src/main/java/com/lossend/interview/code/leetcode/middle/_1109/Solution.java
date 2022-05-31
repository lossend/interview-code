package com.lossend.interview.code.leetcode.middle._1109;

public class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] result = new int[n];
        for (int i = 0; i < bookings.length; i++) {
            int l = bookings[i][0] - 1;
            int r = bookings[i][1] - 1;
            int d = bookings[i][2];
            result[l] += d;
            if ((r + 1) < n) {
                result[r + 1] -= d;
            }
        }
        for (int i = 1; i < n; i++) {
            result[i] += result[i - 1];
        }
        return result;
    }
}
