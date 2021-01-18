package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Flamaster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("How many tests: ");
        int amountOfTests = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < amountOfTests; i++) {
//            System.out.println("String input: ");
            String[] textFromInput = scanner.nextLine().split("");
            List<String> reducedList = reduceRepeatingCharacters(textFromInput);
            List<String> finalList = countRepeatingCharacters(textFromInput, reducedList);
            for (String s : finalList) {
                System.out.print(s);
            }
            System.out.println("");
        }

    }

    public static List<String> reduceRepeatingCharacters(String [] givenArray){
        List<String> temporaryList = new ArrayList<>();
        for (String element : givenArray) {
            if (!temporaryList.contains(element))
                temporaryList.add(element);
        }
        return temporaryList;
    }

    public static List<String> countRepeatingCharacters(String [] givenArray, List<String> givenList){
        for (int i = 0; i < givenList.size(); i++){
            int countRepeats = 0;
            for (String element : givenArray) {
                if (element.equals(givenList.get(i))) {
                    countRepeats++;
                }
            }
            if (countRepeats == 2){
                givenList.add(i+1, givenList.get(i));
                i++;
            }
            else if (countRepeats > 2){
                givenList.add(i+1, String.valueOf(countRepeats));
                i++;
            }
        }
        return givenList;
    }
}