package com.fju;

import java.util.Scanner;

public class Vending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        boolean end = false;
        int[] prices = {15, 25, 20};
        System.out.println(prices.length);
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }
        while (!end) {
            System.out.println("Please put your coin (1/5/10):    Total:" + total);
            String s = scanner.next();
            switch (s) {
                case "1":
                case "5":
                case "10":
                    int n = Integer.parseInt(s);
                    total+=n; //total = total + 1;
                    break;
                case "a":
                case "b":
                case "c":
                    int index = s.charAt(0)-97;
                    if (total >= prices[index]) {
                        System.out.println("DON!");
                        total-=prices[index];
                    } else {
                        System.out.println("BEEP!");
                    }
                    break;
                case "0":
                    end = true;
                    break;
                default:
                    System.out.println("Wrong answer");
                    break;
            }
        }
        System.out.println("END");
    }
}
