package com.yun;

public class StarLine {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 20; k++) {
                if (2*i == 19-k) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
