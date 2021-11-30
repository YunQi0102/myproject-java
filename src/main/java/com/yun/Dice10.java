package com.fju;

import java.util.Random;

public class Dice10 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int secret = random.nextInt(6)+1;
            System.out.println(secret);
        }
        int[] num = new int[6];
    }
}
