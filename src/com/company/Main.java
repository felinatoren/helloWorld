package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //scanner
        Scanner input = new Scanner(System.in);

        //variabler
        int a;
        int b;

        //infomation
        System.out.println("skriv et tal");

        //hvad er a
        a = input.nextInt();
        System.out.println(a);

        //hvad er b
        System.out.println("skriv et tal");

        b = input.nextInt();
        System.out.println(b);

        //hvad er det sat sammen
        System.out.println("så er det lige med");
        System.out.println(a * b);
    }
}
