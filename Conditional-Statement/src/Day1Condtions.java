/* Author : Aswin.M.A
 * optimization of this code will be figured out later
 * Problem : Write a program to check if a number is positive, negative or zero */

import java.util.Scanner;

public class Day1Condtions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = input.nextInt();
        checkNumber(num);
        input.close();
    }
    public static void checkNumber(int num){
        //check whether the number is zero
        if(num==0){
            System.out.println("The number you entered is zero");
        }
        else if(num<0){
            System.out.println("The number you entered is a negative number");
        }
        if(num>0){
            System.out.println("The number you have entered is a positive number");
        }
    }
}
