package com.dsa.assignments;

import java.util.Scanner;

/**
 * @author Abhishek
 */
public class CheckEvenOrOddNumbers {
    public static void main(String[] args) {
        System.out.print("Please enter a number ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String result = (i % 2 == 0) ? "even" : "odd";
        System.out.println(i + " is " + result);
    }
}
