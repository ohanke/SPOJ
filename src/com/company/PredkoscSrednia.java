package com.company;

import java.util.Scanner;

public class PredkoscSrednia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Amount of tests: ");
        int amountOfTests = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < amountOfTests; i++) {
            System.out.println("Podaj v1: ");
            int v1 = scanner.nextInt();
            System.out.println("Podaj v2: ");
            int v2 = scanner.nextInt();
            int averageSpeed = 2*v1*v2 / (v1+v2);
            System.out.println("Average Speed: ");
            System.out.println(averageSpeed);
        }
    }
}
