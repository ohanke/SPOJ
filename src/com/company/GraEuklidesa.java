package com.company;

import java.util.Scanner;

public class GraEuklidesa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many tests: ");
        int amountOfTests = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < amountOfTests; i++){
            System.out.println("Enter two numbers: ");
            System.out.println(euclideanGame(scanner.nextInt(), scanner.nextInt()));
        }
    }
    public static int euclideanGame(int playerOne, int playerTwo){
        if (playerOne == 0 || playerOne == playerTwo)
            return playerOne + playerTwo;

        while(playerOne != 0 && playerOne != playerTwo){
            if (playerOne > playerTwo){
                playerOne -= playerTwo;
            }
            else
                playerTwo -= playerOne;
        }
        return playerOne + playerTwo;
    }
}