package com.company;

import java.util.Scanner;

public class Polowa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Amount of tests: ");
        int amountOfTests = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < amountOfTests; i++) {
            System.out.println("Enter a string: ");
            String input = scanner.nextLine();
            String halfOfTheInput = input.substring(0, input.length()/2);
            System.out.println(halfOfTheInput);
        }
    }
}
