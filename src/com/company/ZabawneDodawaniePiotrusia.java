package com.company;

import java.util.Scanner;

public class ZabawneDodawaniePiotrusia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many tests: ");
        int amountOfTests = scanner.nextInt();
        for (int i = 0; i < amountOfTests; i++){
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            int count = 0;
            while (!isPalindrome(number)){
                count++;
                number += getReversedNumber(number);
            }
            System.out.println("Palindrome found: " + number + ". Iterations needed: " + count + ".");
        }
    }

    public static boolean isPalindrome(int number){
        String numberToString = String.valueOf(number);
        boolean numberIsPalindrome = true;
        int length = numberToString.length();
        for (int i = 0; i < length/2; i++){
            if (numberToString.charAt(i) != numberToString.charAt((length-1)-i)){
                numberIsPalindrome = false;
                break;
            }
        }
        return numberIsPalindrome;
    }

    public static int getReversedNumber(int number){
        int units = number % 10;
        int tens = (number / 10) % 10;
        int hundrets = (number / 100) % 100;
        int thousands = (number / 1000) % 1000;
        int tensOfThousands = number / 10000;
        int reversedNumber = units;

        if (number >= 10 && number < 100){
            reversedNumber = (units*10) + tens;
        }
        else if (number >= 100 && number < 1000){
            reversedNumber = (units*100) + (tens*10) + hundrets;
        }
        else if (number >= 1000 && number < 10000){
            reversedNumber = (units*1000) + (tens*100) + (hundrets*10) + thousands;
        }
        else if (number >= 10000 && number < 100000){
            reversedNumber = (units*10000) + (tens*1000) + (hundrets*100) + (thousands*10) + tensOfThousands;
        }
        return reversedNumber;
    }
}