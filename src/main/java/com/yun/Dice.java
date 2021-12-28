package com.fju;

import java.util.Random;

public class Dice {
    int point = 1;

    public Dice() {
        point = new Random().nextInt(6)+1;
    }
    /*public void roll() {
        Random random = new Random();
        point = random.nextInt(6)+1;
    }*/

    public boolean isMax() {
        return point == 6;
        /*if (point == 6) {
            return true;
        } else {
            return false;
        }*/
    }
}
