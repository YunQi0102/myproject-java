package com.yun;

public class Stars {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 20; k++) {
                if (i == k) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

