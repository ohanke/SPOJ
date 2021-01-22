package com.company;

import java.util.Scanner;

public class ProblemCollatza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many tests: ");
        int amountOfTests = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < amountOfTests; i++){
            System.out.println(calculateEquation(scanner.nextInt(), 0));
        }
    }

    public static int calculateEquation(int n, int iteration){
        boolean lel;
        while(n != 1){
            if (n % 2 == 0){
                n /= 2;
                iteration++;
                return calculateEquation(n, iteration);
            }
            else{
                n = 3 * n + 1;
                iteration++;
                return calculateEquation(n, iteration);
            }
        }
        return iteration;
    }
}
