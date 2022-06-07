package com.lossend.interview.code.leetcode.middle._0204;

import java.util.Arrays;

public class Solution {
    public int countPrimes(int n) {
        int[] isPrime = new int[n];
        Arrays.fill(isPrime, 1);
        int ans = 0;
        for (int i = 2; i < n; ++i) {
            if (isPrime[i] == 1) {
                ans += 1;
                if ((long) i * i < n) {
                    for (int j = i * i; j < n; j += i) {
                        isPrime[j] = 0;
                    }
                }
            }
        }
        return ans;
    }
    public int countPrimes2(int n) {
        int count = 0;
        int[] prime = new int[n];
        for (int i = 2; i < n ; i++) {
            boolean isPrime = true;
            int m = (int)Math.sqrt(i);
            for (int j = 0; j < count; j++) {
                if (prime[j] > m) {
                    break;
                }
               if (i % prime[j] == 0) {
                   isPrime = false;
                   break;
               }
            }
            if (isPrime) {
                prime[count++] = i;
            }
        }
        return count;
    }
}
