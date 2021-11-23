package com.fju;

import java.util.Scanner;

public class Vending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        boolean end = false;
        int aPrice = 15;
        int bPrice = 25;
        while (!end) {
            System.out.println("Please put your coin (1/5/10):    Total:" + total);
            String s = scanner.next();
            try {
                int num = Integer.parseInt(s);
                switch (num) {
                    case 1:
                    case 5:
                    case 10:
                        total = total + num;
                        break;
                    case 0:
                        end = true;
                        break;
                    default:
                        break;
                }
            } catch (NumberFormatException e) {
                if (s.equals("a")) {
                    System.out.println("water");
                    if (total >= aPrice) {
                        total = total - aPrice;
                        System.out.println("DON!");
                    } else {
                        System.out.println("BEEP!");
                    }
                }
            }
        }
        System.out.println("END");
    }
}
