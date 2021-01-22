package com.company.Sort1;

public class Point implements Comparable<Point> {
    private String NAME;
    private int X;
    private int Y;

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    @Override
    public int compareTo(Point givenPoint) {
        return this.X - givenPoint.getX();
    }
}