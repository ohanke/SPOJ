package com.company;

import java.util.Scanner;

public class RownanieLiniowe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers of type double: ");
        String input = scanner.nextLine();
        double [] arrayOfNumbers = toDoubleArray(input);
        double a = arrayOfNumbers[0];
        double b = arrayOfNumbers[1];
        double c = arrayOfNumbers[2];

        switch (linearEquationsSolutions(a, b, c)){
            case 0:
                System.out.println("BR");
                break;
            case 1:
                System.out.println(getEquationsResult(a, b, c));
                break;
            case 2:
                System.out.println("NWR");
                break;
        }
    }

    public static double [] toDoubleArray(String stringGiven){
        String [] stringArray = stringGiven.split(" ");
        double [] doublesArray = new double[stringArray.length];
        for (int i = 0; i < doublesArray.length; i++) {
            doublesArray[i] = Double.parseDouble(stringArray[i]);
        }
        return doublesArray;
    }

    public static int linearEquationsSolutions(double a, double b, double c){
        if (a != 0)
            return 1; //one solution
        else if (b == c)
            return 2; //inf
        else if (b == 0)
            return 0; //zero s.
        else
            return 0; //zero solutions
    }

    public static double getEquationsResult(double a, double b, double c){
        double result = (c - b)/a;
        result = Math.round(result * 100) / 100.0;
        return result;
    }
}
