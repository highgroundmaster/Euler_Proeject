package com.hm;

import java.util.Scanner;

public class Fibonacci {

    public static void fibonacci(){
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter the Number of Terms : ");
        int numTerms = scanner.nextInt();
        Fibonacci.printSeries(numTerms);
        System.out.print("\nEnter the Upperbound for Sum : ");
        numTerms = scanner.nextInt();
        System.out.println(Fibonacci.findSum(numTerms));

    }

    public static int findSum(int upperbound){
        int sum = 0;
        int evenSum = 0;
        int first = 0;
        int second = 1;
        int latest = 1;
        while (sum <= 4000000){
            latest = first + second;
            int temp = latest;
            first = second;
            second = temp;
            sum += latest;
            if(latest % 2 == 0)
                evenSum += latest;
        }

        return evenSum;
    }

    public static void printSeries(int numTerms){
        int first = 0;
        int second = 1;
        int latest = 1;
        for (int i = 0; i < numTerms; i++) {
            System.out.print(first + " ");
            latest = first + second;
            int temp = latest;
            first = second;
            second = temp;
        }
    }



}
