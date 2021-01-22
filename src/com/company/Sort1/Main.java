package com.company.Sort1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many tests: ");
        int amountOfTests = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < amountOfTests; i++){
            System.out.println("How many objects: ");
            int amountOfObjects = scanner.nextInt();
            List<Point> pointList = new ArrayList<>();

            for (int j = 0; j < amountOfObjects; j++) {
                scanner.nextLine();
                Point point = new Point();
                System.out.println("Set points name: ");
                point.setNAME(scanner.nextLine());
                System.out.println("Set points X");
                point.setX(scanner.nextInt());
                System.out.println("Set points Y");
                point.setY(scanner.nextInt());
                pointList.add(point);
            }

            System.out.println("Unsorted list: ");
            for (Point point : pointList) {
                System.out.println("Point: " + point.getNAME() + ", X: " + point.getX() + ", Y: " + point.getY());
            }

            Collections.sort(pointList);
            System.out.println("Sorted list: ");
            for (Point point : pointList) {
                System.out.println("Point: " + point.getNAME() + ", X: " + point.getX() + ", Y: " + point.getY());
            }
        }
    }
}