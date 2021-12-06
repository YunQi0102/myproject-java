package com.yun;

import java.util.Random;
import java.util.Scanner;

public class Guess1To100while {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(100)+1;
        System.out.println(secret);
        int min = 0;
        int max = 100;
        boolean play = true;
        while (play) {
            System.out.println("PLease enter a number "+min+" to "+max+":");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();
            int num = Integer.parseInt(s);
            if (num > secret) {
                max = num;
            } else if (num < secret) {
                min = num;
            } else {
                System.out.println("You win!");
                play = false;
            }
        }
    }
}
