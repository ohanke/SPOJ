package com.company;

import java.util.Scanner;

public class ProsteDodawanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many tests: ");
        int amountOfTests = scanner.nextInt();
        for (int i = 0; i < amountOfTests; i++) {
            System.out.println("How many numbers: ");
            int numbersAmount = scanner.nextInt();
            int [] numberArray = new int[numbersAmount];
            for (int j = 0; j < numberArray.length; j++){
                System.out.println("Enter the " + j+1 + " number: ");
                numberArray[j] = scanner.nextInt();
            }
            System.out.println(addNumbers(numberArray));
        }
    }
    public static int addNumbers(int [] numbers){
        int sum = 0;
        for (int element : numbers){
            sum += element;
        }
        return sum;
    }
}
