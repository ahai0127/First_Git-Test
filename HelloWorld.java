package com.my.first_project;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(Math.max(3, 6));
        nPrintln("SB", 3);
    }

    public static void nPrintln(String message, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }
}

