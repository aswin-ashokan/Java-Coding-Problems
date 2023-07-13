/* Author : Aswin.M.A
 * Problem : Write a program to calculate the sum of numbers from 1 to n using a loop
  */

import java.util.Scanner;

public class Day2Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = input.nextInt();
        System.out.println("The Sum of 1 to n is : " + sumLoop(n));

    }
    public static int sumLoop(int n){
        int sum=0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
