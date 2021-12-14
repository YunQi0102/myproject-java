package com.fju;

public class Poker {
    public static void main(String[] args) {
        char[] types = {'s','h','d','c'};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print((j+1) +""+ types[i]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
