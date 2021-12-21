package com.fju;

import java.util.Random;

public class GuessGame {
    Random random = new Random();
    int secret = random.nextInt(10)+1;
    boolean end = false;

    public boolean bigger(int n) {
        if (n == secret) {
            end = true;
        }
        return (n > secret);
        }
    public boolean smaller(int n) {
        if (n == secret) {
            end = true;
        }
        return (n < secret);
    }
}
