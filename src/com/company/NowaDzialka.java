package com.company;

import java.util.Scanner;

public class NowaDzialka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountOfTests = scanner.nextInt();
        for (int i = 0; i < amountOfTests; i++) {
            int number = scanner.nextInt();
            System.out.println((int) Math.pow(number, 2));
        }
    }
}
