package com.company;

import java.util.Scanner;

public class ROL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many tests: ");
        int amountOfTests = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < amountOfTests; i++) {
            System.out.println("Enter some numbers: ");
            String input = scanner.nextLine();
            int [] myIntArray = convertToIntArray(input);
            System.out.println("Array with each index moved to the left: ");
//            System.out.println(Arrays.toString(moveEachIndexToTheLeft(myIntArray)));
            printArray(moveEachIndexToTheLeft(myIntArray));
        }
    }

    public static int [] convertToIntArray(String input){
        String [] myStringArray = input.split(" ");
        int [] arrayOfIntegers = new int[Integer.parseInt(myStringArray[0])];
        for (int j = 0; j < arrayOfIntegers.length; j++) {
            arrayOfIntegers[j] = Integer.parseInt(myStringArray[j+1]);
        }
        return arrayOfIntegers;
    }

    public static int [] moveEachIndexToTheLeft(int [] givenArray){
        int temp;
        for (int i = 0; i < (givenArray.length-1); i++) {
            if (i == 0){
                temp = givenArray[i];
                givenArray[i] = givenArray[(givenArray.length-1)-i];
                givenArray[(givenArray.length-1)-i] = temp;
            }
            else{
                temp = givenArray[i];
                givenArray[i] = givenArray[i-1];
                givenArray[i-1] = temp;
            }
        }
        return givenArray;
    }

    public static void printArray(int [] givenArray){
        for (int i : givenArray) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}