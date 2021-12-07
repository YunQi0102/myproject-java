package com.fju;

import java.util.Random;
import java.util.Scanner;

public class Guess1To20 {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(20)+1;
        System.out.println(secret);
        System.out.println("Please enter a number 1-20:");
        boolean win = false;
        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();
            int num = Integer.parseInt(s);
            if (num < secret) {
                System.out.println("Bigger");
            } else if (num > secret) {
                System.out.println("Smaller");
            } else {
                win = true;
                break;
            }
        }
        if (win) {
            System.out.println("You win");
        } else {
            System.out.println("You loose");
        }
        System.out.println("The secret number is "+secret);
    }
}
