package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class SredniaArytmetyczna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many tests?");
        int amountOfTests = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < amountOfTests; i++) {
            System.out.println("Enter some numbers");
            String input = scanner.nextLine();
            int [] numberArray = toIntArray(input);
            System.out.println(Arrays.toString(numberArray));
            double average = findTheAverageValue(numberArray);
            System.out.println("Average value: " + average);
            System.out.println("Closest to the average: " + findTheClosestNumber(average, numberArray));
        }
    }

    public static int [] toIntArray(String stringGiven){
        String [] stringArray = stringGiven.split(" ");
        int [] intArray = new int[Integer.parseInt(stringArray[0])];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i+1]);
        }
        return intArray;
    }

    public static double findTheAverageValue(int [] givenArray){
        double average = 0;
        for (int element : givenArray) {
            average += element;
        }
        return average / givenArray.length;
    }

    public static int findTheClosestNumber(double averageValue, int [] givenArray){
        int closest = givenArray[0];
        double currentValue = givenArray[0] - averageValue;
        double earlierValue = 0;

        for (int i = 1; i < givenArray.length; i++){
            earlierValue = currentValue;
            currentValue = givenArray[i] - averageValue;
            if (Math.abs(currentValue) < Math.abs(earlierValue))
                closest = givenArray[i];
        }
        return closest;
    }
}
