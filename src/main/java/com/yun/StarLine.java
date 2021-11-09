package com.yun;

public class StarLine {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            for (int k = 0; k < 21; k++) {
                if (2*i == 20-k || 2*i == k) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
