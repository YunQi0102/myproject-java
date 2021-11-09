package com.yun;

public class StarArrow {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            for (int k = 0; k < 21; k++) {
                if ((2*i == k || 2*i == 20-k) && k <= 10) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
