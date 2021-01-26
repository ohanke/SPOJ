package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParzysteNieparzyste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Amount of test:");
        int amountOfTest = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < amountOfTest; i++) {
            System.out.println("Enter some numbers: ");
            String input = scanner.nextLine();
            int [] numberArray = toIntArray(input);

            List<Integer> evenNumbers = getEvenNumber(numberArray);
            List<Integer> oddNumbers = getOddNumber(numberArray);
//            System.out.println("Even numbers: " + evenNumbers.toString());
//            System.out.println("Odd number: " + oddNumbers.toString());

            for (Integer evenNumber : evenNumbers) {
                System.out.print(evenNumber + " ");
            }
            for (Integer oddNumber : oddNumbers) {
                System.out.print(oddNumber + " ");
            }
            System.out.println("");
        }
    }

    public static int [] toIntArray(String stringGiven){
        String [] stringArray = stringGiven.split(" ");
        int [] intArray = new int[Integer.parseInt(stringArray[0])];

        for (int i = 0; i < intArray.length; i++){
            intArray[i] = Integer.parseInt(stringArray[i+1]);
        }
        return intArray;
    }

    public static List<Integer> getEvenNumber(int [] givenArray){
        List<Integer> integerList = new ArrayList<>();

        for (int j : givenArray) {
            if (j % 2 == 0)
                integerList.add(j);
        }

        return integerList;
    }
    public static List<Integer> getOddNumber(int [] givenArray){
        List<Integer> integerList = new ArrayList<>();

        for (int j : givenArray) {
            if (j % 2 != 0)
                integerList.add(j);
        }

        return integerList;
    }
}
