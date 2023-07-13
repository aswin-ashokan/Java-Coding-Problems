/* Author : Aswin.M.A
 * Problem : Write a program to find the maximum of two numbers using conditional statements
 */

import java.util.Scanner;

public class Day2Conditions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number 1 :");
        int num1 = input.nextInt();
        System.out.println("Enter the number 2 :");
        int num2 = input.nextInt();
        System.out.println("The Maximum number is : " + checkMax(num1,num2));
    }
    public static int checkMax(int num1, int num2){
        if(num1>=num2){
            return num1;
        }
        else
            return num2;
    }

}
