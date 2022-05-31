package com.lossend.interview.code.nowcoder.hj._0048;

import java.io.ByteArrayInputStream;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String input = "5 2 3 2 4 3 5 2 1 4 3\n" +
                "6 2 1 2 3 2 5 1 4 5 7 2 2";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()) {
            int size = scanner.nextInt();
            int headValue = scanner.nextInt();
            LinkedList<Integer> l = new LinkedList<Integer>();
            l.add(headValue);
            int cnt = size - 1;
            while (cnt-- > 0) {
                int value = scanner.nextInt();
                int prevValue = scanner.nextInt();
                int idx = l.indexOf(prevValue);
                if (idx != -1) {
                    l.add(idx+1, value);
                }
            }
            int removeValue = scanner.nextInt();
            l.remove((Integer) removeValue);
            System.out.println(l.stream().map(String::valueOf).collect(Collectors.joining(" ")));
        }
    }
}
