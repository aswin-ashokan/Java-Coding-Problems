/* Author : Aswin.M.A
 * Problem : Write a program to print numbers from 1 to n using for loop
 * optimization of this code will be figured out later */

import java.util.Scanner;

public class Day1Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
