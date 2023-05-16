package com.bridglabz.LineComparisonProblem;

public class LineComparisonProblem {
    public static void main(String[] args) {
        // Start with displaying welcome to line comparison computation..
        System.out.println("Welcome to line computation program");

        // Calculate length1..
        double length1=lengthMethod(3,10,9,20);
        String str1=String.valueOf(length1);
        System.out.println(str1);

        // Calculate length2..
        double length2=lengthMethod(8,15,6,12);
        String str2=String.valueOf(length2);
        System.out.println(str2);

        // equals method
        System.out.print("Equals method: "+ str1.equals(str2));
        System.out.println();
    }
    public static double lengthMethod(int x1,int x2,int y1,int y2){
        double length3=Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
        System.out.println(length3);
        return length3;
    }
}
