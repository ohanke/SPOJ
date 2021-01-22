package com.company;

import java.util.Scanner;

public class RownanieKwadratowe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A: ");
        double a = scanner.nextDouble();
        System.out.println("Enter B: ");
        double b = scanner.nextDouble();
        System.out.println("Enter C: ");
        double c = scanner.nextDouble();

        System.out.println("The quadratic equation has " + quadraticEquation(a, b, c) + " answers.");
    }

    public static int quadraticEquation(double a, double b, double c){
        if (a == 0){
            System.out.println("Thats not a quadratic equation!");
            return -1;
        }

        double powerOf = Math.pow(b, 2);
        double discriminat = powerOf - (4 * (a * c));

        if (discriminat > 0)
            return 2;
        else if (discriminat == 0)
            return 1;
        else
            return 0;
    }
}
