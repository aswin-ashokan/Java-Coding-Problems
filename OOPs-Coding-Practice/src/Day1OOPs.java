/* Author : Aswin.M.A
 * Problem : Create a class to represent a Circle with attributes such as radius and methods to calculate area and circumference. */

import java.util.Scanner;

public class Day1OOPs {
    final static float pi = 3.14f;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        float radius = input.nextFloat();
        System.out.println(calculateArea(radius));
        System.out.println(calculateCircum(radius));
    }
    public static float calculateArea(float radius){
        float area = pi*radius*radius;
        return area;
    }
    public static float calculateCircum(float radius){
        float circum = 2* pi * radius;
        return circum;
    }
}
