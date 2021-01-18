package com.company;

import java.util.Scanner;

public class CzyUmieszPotegowac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many tests: ");
        int amountOfTests = scanner.nextInt();
        for (int i = 0; i < amountOfTests; i++){
            System.out.println("Base: ");
            int base = scanner.nextInt();
            System.out.println("Power: ");
            int power = scanner.nextInt();
            int number = getPowerOf(base, power);
            System.out.println(number % 10);
        }
    }

    public static int getPowerOf(int base, int power){
        int result = 1;
        for (int i = 0; i < power; i++){
            result *= base;
        }
        return result;
    }
}
