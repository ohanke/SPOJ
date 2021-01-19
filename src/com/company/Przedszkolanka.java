package com.company;

import java.util.Scanner;

import java.util.Scanner;

public class Przedszkolanka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many tests: ");
        int amountOfTests = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < amountOfTests; i++) {
            System.out.println("Enter the first number: ");
            int a = scanner.nextInt();
            System.out.println("Enter the second number: ");
            int b = scanner.nextInt();
            System.out.println("Leats common multiple: " + getLeatsCommonMultiple(a, b));
        }
    }

    public static int getLeatsCommonMultiple(int a, int b){
        int multipleOfB = b;
        boolean lcmFound = false;
        while (!lcmFound){
            if (multipleOfB % a == 0)
                lcmFound = true;
            else
                multipleOfB += b;
        }
        return multipleOfB;
    }
}
