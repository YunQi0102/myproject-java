package com.fju;

import java.util.Random;

public class DiceHighest {
    public static void main(String[] args) {
        Random random = new Random();
        int[] counters = new int[6];
        for (int i = 0; i < 10; i++) {
            int n = random.nextInt(6)+1;
            System.out.println(n);
            counters[n-1]++;
        }
        int max = 0;
        for (int i = 0; i < 6; i++) {
            //System.out.println((i+1)+" "+counters[i]+" times");
            if (counters[i] > max) {
                max = counters[i];
                System.out.println((i + 1) + " " + counters[i]+" times");
            }
        }
    }
}
