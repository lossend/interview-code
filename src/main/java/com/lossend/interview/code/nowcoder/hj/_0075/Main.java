package com.lossend.interview.code.nowcoder.hj._0075;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()) {
            String a = scanner.nextLine();
            if (!scanner.hasNextLine()) {
                break;
            }
            String b = scanner.nextLine();
            System.out.println(longestSubSeq(a, b));
        }
    }
    public static int longestSubSeq(String a, String b) {
        if (a.length() < b.length()) {
            String tmp = a;
            a = b;
            b = tmp;
        }
        int maxLength = 0;
        int[][] dp = new int[a.length()+1][b.length()+1];
        for (int i = 0; i < a.length()+1; i++) {
            for (int j = 0; j < b.length() + 1; j++) {
                if (i== 0 || j== 0) {
                    dp[i][j] = 0;
                } else {
                    if (a.charAt(i-1)== b.charAt(j-1)) {
                        dp[i][j] = dp[i-1][j-1] + 1;
                    } else {
                        dp[i][j] = 0;
                    }
                }
                if (dp[i][j] > maxLength) {
                    maxLength = dp[i][j];
                }
            }
        }
        return maxLength;
    }
    public static int longestSeqNumber(String a, String b) {
        int[][] dp = new int[a.length()+1][b.length()+1];
        int maxLength = 0;
        for (int i = 0; i < a.length()+1; i++) {
           for (int j = 0; j < b.length()+1; j++) {
               if (i== 0 || j== 0) {
                   dp[i][j] = 0;
               } else {
                   if (a.charAt(i-1) == b.charAt(j-1)) {
                       dp[i][j] = dp[i-1][j-1] +1;
                   } else {
                       dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                   }
               }
               if (maxLength < dp[i][j]) {
                   maxLength = dp[i][j];
               }
           }
        }
        return maxLength;
    }
}
