package com.company;

import java.util.Scanner;

public class Obzartuchy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many tests: ");
        int amountOfTests = scanner.nextInt();
        scanner.nextLine();

        int festivalDuration = 86400;
        for (int i = 0; i < amountOfTests; i++){
            int cookiesTotal = 0;
            int boxesTotal = 0;
            System.out.println("How many gluttons will there be: ");
            int amountOfGluttons = scanner.nextInt();
            System.out.println("How many cookies in one box: ");
            int cookiesInOneBox = scanner.nextInt();

            for (int j = 0; j < amountOfGluttons; j++) {
                System.out.println("Enter the time needed for a glutton to eat a cookie: ");
                int cookieEatingTime = scanner.nextInt();
                cookiesTotal += (festivalDuration / cookieEatingTime);
                System.out.println("Cookies needed: " + cookiesTotal);
            }
            boxesTotal += (cookiesTotal / cookiesInOneBox);
            if ((cookiesTotal % 10 != 0) && (cookiesTotal % cookiesInOneBox != 0))
                boxesTotal++;
            System.out.println("Boxes needed: " + boxesTotal);
        }
    }
}
