package com.yun;

public class Practice {
    public static void main(String[] args) {
        System.out.println("Hello!");
        int age = 20;
        boolean adult = age > 18;
        System.out.println(adult);
        
        //unicode
        int n = 0x00F6;
        System.out.println((char)n);

        int n = 5;
        boolean result = n > 4;
        System.out.println(result);
        result = (n >= 0) && (n < 6);
        System.out.println(result);
        if (result) {
            System.out.println("Good for you!");
        } else {
            System.out.println("Too bad");
        }
    }
}
