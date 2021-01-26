package com.company;

import java.util.Scanner;

public class Pesel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("How many tests: ");
        int amountOfTests = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < amountOfTests; i++){
            String [] stringArray = scanner.nextLine().split("");
            int [] intArray = convertToIntArray(stringArray);
            int result = calculateNumbers(intArray);
//            System.out.println("Result: " + result);
            System.out.println(validateResult(result));
        }
    }

    public static int [] convertToIntArray(String [] arrayGiven){
        int [] convertedArray = new int[arrayGiven.length];

        for (int i = 0; i < convertedArray.length; i++) {
            convertedArray[i] = Integer.parseInt(arrayGiven[i]);
        }

        return convertedArray;
    }

    public static int calculateNumbers(int [] givenArray){
        return givenArray[0] + (givenArray[1]*3) + (givenArray[2] * 7) + (givenArray[3] * 9) +
                givenArray[4] + (givenArray[5] * 3) + (givenArray[6] * 7) + (givenArray[7] * 9) +
                givenArray[8] + (givenArray[9] * 3) + givenArray[10];

    }

    public static char validateResult(int numberGiven){
        String [] stringArray = String.valueOf(numberGiven).split("");
        if (stringArray[stringArray.length-1].equals("0"))
            return 'D';
        else
            return 'N';
    }
}
