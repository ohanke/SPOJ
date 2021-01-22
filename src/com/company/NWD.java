package com.company;

import java.util.Scanner;

public class NWD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many tests: ");
        int amountOfTests = scanner.nextInt();
        for (int i = 0; i < amountOfTests; i++){
            System.out.println("Enter the first number: ");
            int firstNumber = scanner.nextInt();
            System.out.println("Enter the second number: ");
            int secondNumber = scanner.nextInt();
            System.out.println("Outcome: " + getNWD(firstNumber, secondNumber));
        }
    }

    public static int getNWD(int a, int b){
        if (a < 0 || b < 0)
            return 0;
        if (b > 0){
            int temp = b;
            b = a % b;
            a = temp;
            return getNWD(a, b);
        }
        return a;
    }
}
