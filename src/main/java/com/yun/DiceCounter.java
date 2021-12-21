package com.fju;

public class DiceCounter {
    public static void main(String[] args) {
        int[] counters = new int[6];
        for (int i = 0; i < 10; i++) {
            Dice dice = new Dice();
            Dice dice1 = new Dice();
            dice.roll();
            System.out.println(dice.point);
            counters[dice.point-1]++;
        }
        for (int i = 0; i < 6; i++) {
            System.out.println((i+1)+" "+counters[i]+" times");
        }
    }
}
