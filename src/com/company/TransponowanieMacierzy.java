package com.company;

import java.util.Scanner;

public class TransponowanieMacierzy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row and column size: ");
        String input = scanner.nextLine();
        int [] numbersFromInput = toIntArray(input);

        int heigh = numbersFromInput[0];
        int width = numbersFromInput[1];
        int [][] matrix = new int[heigh][width];

        for (int i = 0; i < heigh; i++){
            System.out.println("Enter row numbers: ");
            input = scanner.nextLine();
            int [] rowArray = toIntArray(input);
            for (int j = 0; j < width; j++){
                matrix[i][j] = rowArray[j];
            }
        }
        printMatrix(transposeMatrix(matrix));
    }

    public static int [][] transposeMatrix(int [][] matrixGiven){
        int heigh = 0;
        int width = 0;
        for (int[] ints : matrixGiven) {
            width = ints.length;
            heigh++;
        }

        int [][] transposedMatrix = new int[width][heigh];

        for (int i = 0; i < width; i++){
            for (int j = 0; j < heigh; j++){
                transposedMatrix[i][j] = matrixGiven[j][i];
            }
        }
        return transposedMatrix;
    }

    public static int [] toIntArray(String input){
        String [] stringArray = input.split(" ");
        int [] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        return intArray;
    }

    public static void printMatrix(int [][] matrixGiven){
        int heigh = 0;
        int width = 0;
        for (int[] ints : matrixGiven) {
            width = ints.length;
            heigh++;
        }

        for (int i = 0; i < heigh; i++){
            if (i != 0)
                System.out.println("");
            for (int j = 0; j < width; j++){
                System.out.print(matrixGiven[i][j] + " ");
            }
        }
    }
}
