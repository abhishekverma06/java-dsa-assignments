package com.dsa.assignments;

import java.util.Scanner;

/**
 * @author Abhishek
 */
public class CalculateSimpleIntrest {
    public static void main(String[] args) {
        System.out.println(" Please Enter Principal Amount");
        int principal = new Scanner(System.in).nextInt();
        System.out.println(" Please Enter Time in years");
        int time = new Scanner(System.in).nextInt();
        System.out.println(" Please Enter Rate");
        int rate = new Scanner(System.in).nextInt();

        System.out.println("Simple Intrest = " + principal * time * rate);
    }
}
