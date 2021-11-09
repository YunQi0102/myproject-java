package com.yun;

import java.util.Random;
import java.util.Scanner;

public class Guess1To10 {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(10)+1;
        System.out.println(secret);
        System.out.println("Please enter a number 1-10:");
        boolean play = true;
        while (play) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();
            int num = Integer.parseInt(s);
            if (num > secret) {
                System.out.println("Smaller");
            } else if (num < secret) {
                System.out.println("Bigger");
            } else {
                System.out.println("Bingo!");
                play = false;
            }
        }
    }
}
