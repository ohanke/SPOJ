package com.company;

import java.util.Scanner;

public class LiczbyPierwsze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Podaj liczbę testów:");
        int amountOfTests = scanner.nextInt();
        for (int i = 0; i < amountOfTests; i++){
            //System.out.println("Podaj liczbę. Sprawdzę czy jest ona pierwsza: ");
            System.out.println(isPrimeNumber(scanner.nextInt()));
        }
    }

    public static String isPrimeNumber(int input){
        if (input < 2)
            return "NIE";
        boolean hasDivider = false;
        for (int i = 2; i*i <= input; i++){
            if (input % i == 0){
                hasDivider = true;
                break;
            }
        }
        if (hasDivider)
            return "NIE";
        else
            return "TAK";
    }
}
