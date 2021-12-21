package com.fju;

public class DiceCounter {
    public static void main(String[] args) {
        int[] counters = new int[6];
        for (int i = 0; i < 10; i++) {
            Dice dice = new Dice();
            dice.roll();
            System.out.print(dice.point);
            String s = dice.isMax() ? "*" : "";
            System.out.println(s);
            /*if (dice.isMax()) {
                System.out.println("*");
            } else {
                System.out.println();
            }*/
            counters[dice.point-1]++;
        }
        for (int i = 0; i < 6; i++) {
            System.out.println((i+1)+" "+counters[i]+" times");
        }
    }
}
