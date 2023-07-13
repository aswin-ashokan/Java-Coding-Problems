/* Author : Aswin.M.A
 * Problem : Write a program to find the maximum element in an array
 * optimization of this code will be figured out later */

import java.util.Arrays;
import java.util.Scanner;

public class Day1Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the element in arr :");
        int[] array = new int[6];
        for (int i = 0; i < array.length ; i++) {
            array[i] = input.nextInt();
        }
        int max = array[0]; //declaring a max variable which is the value of the 0th index of the array.
        for (int i = 1; i < array.length; i++) {
            if(max < array[i]){ // comparing the max value with other elements in the array
                max = array[i]; // if any element is bigger than max then tha value of that element is stored in max.
            }
        }
        System.out.println(max); //finally print the max value which will be the maximum element in an array.
        input.close();
    }
}
