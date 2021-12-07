package com.fju;

public class Sorting {
    public static void main(String[] args) {
        int[] n = {5,14,3,11,10};
        for (int i = 0; i < n.length - 1; i++) {
            System.out.print(n[i]+"|");
            for (int j = i+1; j < n.length; j++) {
                System.out.print("    "+n[j]+",");
                if (n[i] < n[j]) {
                    //int tmp = n[i];
                    //n[i] = n[j];
                    //n[j] = tmp;
                }
            }
            System.out.println();
        }
    }
}
