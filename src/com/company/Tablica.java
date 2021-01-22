package com.company;

import java.util.Scanner;

public class Tablica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String [] myStringArray = input.split(" ");
        int [] myIntArray = new int[myStringArray.length];

        for (int i = 0; i < myStringArray.length; i++) {
            myIntArray[i] = Integer.parseInt(myStringArray[i]);
        }

        for (int i = myIntArray.length-1; i >= 0; i--) {
            System.out.print(myIntArray[i] + " ");
        }
    }
}
