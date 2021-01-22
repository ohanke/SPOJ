package com.company;


import java.util.Scanner;

public class Tablice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many tests: ");
        int amountOfTests = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < amountOfTests; i++){

            System.out.println("Enter some numbers: ");
            String input = scanner.nextLine();
            int [] myIntArray = convertToIntArray(input);
            printArray(reverseArray(myIntArray));
//            System.out.println("\nArray in original order: " + Arrays.toString(arrayOfIntegers));
//            System.out.println("\nArray in reversed order: " + Arrays.toString(reverseArray(arrayOfIntegers)));
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

    public static int [] reverseArray(int [] arrayOfNumbers){
        for (int i = 0; i < arrayOfNumbers.length/2; i++){
            int temp = arrayOfNumbers[i];
            arrayOfNumbers[i] = arrayOfNumbers[(arrayOfNumbers.length-1)-i];
            arrayOfNumbers[(arrayOfNumbers.length-1)-i] = temp;
        }
        return arrayOfNumbers;
    }

    public static void printArray(int [] givenArray){
        for (int i : givenArray) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}