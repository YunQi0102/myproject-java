package com.fju;

import java.util.Scanner;

public class Guess1To10 {
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        System.out.println(game.secret);
        System.out.println("Please enter a number 1-10:");
        Scanner scanner = new Scanner(System.in);
        while (!game.end) {
            String s = scanner.next();
            int n = Integer.parseInt(s);
            if (game.bigger(n)) {
                System.out.println("Smaller");
            } else if (game.smaller(n)) {
                System.out.println("Bigger");
            } else {
                System.out.println("Bingo!");
            }
        }
    }
}
