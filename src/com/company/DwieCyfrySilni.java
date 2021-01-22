package com.company;

import java.util.Scanner;

public class DwieCyfrySilni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many tests: ");
        int amountOfTests = scanner.nextInt();
        for (int i = 0; i < amountOfTests; i++){
            System.out.println("Number: ");
            int calculatedNumber = factorial(scanner.nextInt());
            int units = calculatedNumber % 10;
            int tens = calculatedNumber / 10;
            System.out.println(tens + " " + units);
        }
    }

    public static int factorial(int input){
        if (input <= 0)
            return 0;
        if (input > 1)
            return input*factorial(input-1);
        else
            return 1;
    }
}