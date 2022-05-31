package com.lossend.interview.code.nowcoder.hj._0107;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextDouble()) {
            double num = scanner.nextDouble();
            System.out.printf("%.1f%n", cube2(num));
        }
    }

    public static double cube(double num) {
        double x = 1.0;
        while ( Math.abs(num - x * x * x) > 1e-3) {
            x = 2 * x / 3 +  num / 3 / x / x;
        }
        return x;
    }
    public static double cube2(double num) {
        double ab = Math.abs(num);
       if (ab < 1)  {
          ab = 1;
       }
        double l = -ab;
        double h = ab;
        double m = 0;
        double diff;
        while (true) {
            m = (h + l) / 2;
            diff =  m*m*m - num;
            if(Math.abs(diff) < 1e-3) {
                return m;
            }
           if (diff > 0) {
               h = m;
           } else {
               l = m;
           }
        }
    }
}
