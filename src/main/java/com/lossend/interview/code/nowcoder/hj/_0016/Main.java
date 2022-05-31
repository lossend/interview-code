package com.lossend.interview.code.nowcoder.hj._0016;

import java.io.ByteArrayInputStream;
import java.util.*;

class Item {
    int p;
    int s;
    int m;
    int a1;
    int a2;
}
public class Main {

    public static void main(String[] args) {
        String input = "4500 12\n" +
                "100 3 0\n" +
                "400 5 0\n" +
                "300 5 0\n" +
                "1400 2 0\n" +
                "500 2 0\n" +
                "800 2 4\n" +
                "1400 5 4\n" +
                "300 5 0\n" +
                "1400 3 8\n" +
                "500 2 0\n" +
                "1800 4 0\n" +
                "440 5 10";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int account = scanner.nextInt();
            int size = scanner.nextInt();
            Item[] items = new Item[size];
            for (int i = 0; i < size; i++) {
                int p = scanner.nextInt();
                int s = scanner.nextInt();
                int m = scanner.nextInt();
                Item item = new Item();
                item.p = p;
                item.s = s;
                item.m = m;
                items[i] = item;
            }
            System.out.println(maxSatisfaction(account, size, items));
        }
    }
    public static int maxSatisfaction(int amount, int size, Item[] items) {
        List<Item> mainItems = new ArrayList<>();
        for (int i = 0; i < items.length; i++) {
            if (items[i].m == 0) {
                mainItems.add(items[i]);
            } else {
                if ( items[items[i].m - 1].a1 == 0) {
                    items[items[i].m - 1].a1 = i + 1;
                } else {
                    items[items[i].m - 1].a2 = i + 1;
                }
            }
        }
        List<List<Integer>> prices = new ArrayList<>();
        int[][] dp = new int[mainItems.size() + 1][amount / 10 + 1];
        int maxSatisffact = 0;
        for (int i = 1; i < mainItems.size()+1; i++) {
            for (int j = 1; j < amount / 10 + 1; j++) {
                Item curr = mainItems.get(i - 1);
                int max = dp[i - 1][j];
                int price = curr.p / 10;
                int s = curr.p * curr.s;
                if (j >= price) {
                    max = Math.max(max, dp[i-1][j-price] + s);
                    if (curr.a1 > 0) {
                        Item sub1 = items[curr.a1 - 1];
                        int price1 = sub1.p / 10;
                        int s1 = sub1.p * sub1.s;
                        if (j - price - price1 >= 0) {
                            max = Math.max(max, dp[i-1][j-price - price1] + s + s1);
                        }
                        if (curr.a2 > 0) {
                            Item sub2 = items[curr.a2 - 1];
                            int s2 = sub2.p * sub2.s;
                            int price2 = sub2.p / 10;
                            if (j - price - price2 >= 0) {
                                max = Math.max(max, dp[i-1][j - price - price2] + s + s2);
                            }
                            if (j - price - price2 - price1>= 0) {
                                max = Math.max(max, dp[i-1][j - price - price2 - price1] + s + s1 + s2);
                            }
                        }
                    }
                }
                dp[i][j] = max;
                if (maxSatisffact < max) {
                    maxSatisffact = max;
                }
            }
        }
        return maxSatisffact;
    }
}
