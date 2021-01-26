package com.company;

import java.util.Scanner;

public class Podzielnosc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Amount of tests: ");
        int amountOfTests = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < amountOfTests; i++) {
            System.out.println("Enter the first number");
            int firstNumber = scanner.nextInt();
            System.out.println("Enter the second number");
            int secondNumber = scanner.nextInt();
            System.out.println("Enter the third number");
            int thirdNumber = scanner.nextInt();

            for (int j = 2; j < firstNumber; j++){
                if (j % secondNumber == 0 && j % thirdNumber != 0)
                    System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
