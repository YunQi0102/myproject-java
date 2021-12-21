package com.fju;

import java.util.Random;

public class Dice {
    int point = 1;

    public void roll() {
        //System.out.println("Rolling");
        Random random = new Random();
        point = random.nextInt(6)+1;
    }
    public boolean isMax() {
        if (point == 6) {
            return true;
        } else {
            return false;
        }
    }
}
