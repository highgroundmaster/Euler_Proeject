package com.hm;
/*

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.

 */


import java.util.Scanner;

class MultipleSum {
    public static void multipleSum(){
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter Factors : ");
        String s[]= scanner.nextLine().split(" ");

        int[] factors = new int[s.length];
        for(int i =0 ;i < s.length;i++){
            factors[i]= Integer.parseInt(s[i]);
        }

        System.out.print("Enter the Upper Bound : ");
        int upperbound = scanner.nextInt();
        System.out.println(MultipleSum.calculateSum(factors, upperbound));
    }

    public static int calculateSum(int[] factors, int upperbound){
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            for (int factor: factors) {
                if (i % factor == 0){
                    sum += i;
                    break;
                }
            }
        }
        return sum;
    }
}
