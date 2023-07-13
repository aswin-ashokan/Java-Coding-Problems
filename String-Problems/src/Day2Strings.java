/* Author : Aswin.M.A
 * Problem : Write a program to check if a string is a palindrome
  */

import java.util.Scanner;

public class Day2Strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = input.next();
        //System.out.println();
        checkPalindrome(str);
    }
    public static void checkPalindrome(String str){
        int lnt = str.length();
        String rev ="";
        for (int i = lnt-1; i >= 0; i--) {
            rev = rev+ str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("It is a palindrome : " + rev);
        }
        else{
            System.out.println("It is not a palindrome : " + rev);
        }
    }
}
