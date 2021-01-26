package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Niekolejne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        if (number > 3){
            int [] intArray = new int[number+1];
            for (int i = 0; i < intArray.length; i++) {
                intArray[i] = i;
            }
            List<Integer> outOfOrderNumbers = new ArrayList<>();
            List<Integer> evenNumbers = getEvenNumber(intArray);
            outOfOrderNumbers.addAll(evenNumbers);
            List<Integer> oddNumbers = getOddNumber(intArray);
            outOfOrderNumbers.addAll(oddNumbers);
            printList(outOfOrderNumbers);
        }
        else
            System.out.println("NIE");
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

    public static void printList(List<Integer> listGiven){
        for (Integer integer : listGiven) {
            System.out.print(integer + " ");
        }
        System.out.println("");
    }
}
