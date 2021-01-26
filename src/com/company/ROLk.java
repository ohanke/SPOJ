package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ROLk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input: ");
        String [] strings = scanner.nextLine().split(" ");
        int [] convertedInput = convertInput(strings);
//        System.out.println("Converted input: " + Arrays.toString(convertedInput));

//        int size = convertedInput[0];
        int move = convertedInput[1];

        strings = scanner.nextLine().split(" ");
        int [] arrayOfNumbers = convertInput(strings);
//        System.out.println("Array of numbers: " + Arrays.toString(arrayOfNumbers));
        int [] finalArray = moveElements(arrayOfNumbers, move);
//        System.out.println("Final array: " + Arrays.toString(finalArray));
        printArray(finalArray);
    }

    public static int [] convertInput(String [] input){
        int [] ints = new int[input.length];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(input[i]);
        }
        return ints;
    }

    public static int [] moveElements(int [] arrayGiven, int distance){
        int [] modifiedArray = new int[arrayGiven.length];

        for (int i = 0; i < arrayGiven.length; i++) {
            int index = i - distance;
            if (index < 0)
                index += arrayGiven.length;
            modifiedArray[index] = arrayGiven[i];
        }
        return modifiedArray;
    }

    public static void printArray(int [] arrayGiven){
        for (int j : arrayGiven) {
            System.out.print(j + " ");
        }
    }
}
