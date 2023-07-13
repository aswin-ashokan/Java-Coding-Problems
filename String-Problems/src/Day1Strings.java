/* Author : Aswin.M.A
 * Problem : Write a program to reverse a string
 * optimization of this code will be figured out later */

import java.util.Scanner;

public class Day1Strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String :");
        String value = input.next();
        System.out.println(reverseString(value));

    }
    public static String reverseString(String value) {
        int lnt = value.length();
        String rev = "";
        for (int i = lnt - 1; i >= 0; i--) {
            rev = rev + value.charAt(i);
        }
        return rev;
    }
}
