package com.fju;

import java.util.Random;

public class OneCardGame {
    public static void main(String[] args) {
        char[] types = {'c', 'd', 'h', 's'};
        Random random = new Random();
        System.out.println("Computer's card: ");
        //prepare cards
        int[] cards = new int[52];
        for (int i = 0; i < 52; i++) {
            cards[i] = i;
            System.out.print(cards[i]+" ");
        }
        System.out.println();
        //shuffle
        for (int i = 0; i < 52; i++) {
            int r = random.nextInt(52);
            int tmp = cards[i];
            cards[i] = cards[r];
            cards[r] = tmp;
        }
        for (int i = 0; i < 52; i++) {
            System.out.print(cards[i]+" ");
        }
        System.out.println();
        //0-51, 52cards
        int computer = cards[0];
        //computer=14:2d
        int point = (computer%13) + 1;
        int type = computer/13;
        System.out.println(point+""+types[type]+" ("+computer+")");
        //player's card
        int player = cards[1];
        int playerPoint = (player%13)+1;
        int playerType = player/13;
        System.out.println(playerPoint+""+types[playerType]+" ("+player+")");
        if (playerPoint > computer || (playerPoint == computer && playerType >type)) {
            System.out.println("You win!");
        } else {
            System.out.println("You loose!");
        }
    }
}
