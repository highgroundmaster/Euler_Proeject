package com.hm;

import java.util.Scanner;

public class LargestFactor {

    public static void largestFactor(){
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter the Number to find factors for : ");
        int number = scanner.nextInt();
        LargestFactor.findLargestFactor(number);
    }

    public static int findLargestFactor(int number){
        return number;
    }
}
