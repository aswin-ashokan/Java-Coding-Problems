/* Author : Aswin.M.A
 * Problem : Write a program to find the minimum element in a array
 */

import java.util.Arrays;
import java.util.Scanner;

public class Day2Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the elements of the array :");
        int [] arr = new int[7];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = input.nextInt();
        }
        checkMinimum(arr);
    }
    public static void checkMinimum(int arr[]){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(min >= arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
