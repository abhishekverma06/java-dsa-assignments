package com.dsa.assignments;

import java.util.Scanner;

/**
 * @author Abhishek
 */
public class PrintGreetingForInputName {
    public static void main(String[] args) {
        System.out.print("Please enter your name ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi " + sc.next());
    }
}
