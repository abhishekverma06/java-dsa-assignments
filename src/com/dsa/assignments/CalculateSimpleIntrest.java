package com.dsa.assignments;

import java.util.Scanner;

/**
 * @author Abhishek
 */
public class CalculateSimpleIntrest {
    public static void main(String[] args) {
        System.out.println(" Please Enter Principal Amount");
        Scanner principal = new Scanner(System.in);
        System.out.println(" Please Enter Time in years");
        Scanner time = new Scanner(System.in);
        System.out.println(" Please Enter Rate");
        Scanner rate = new Scanner(System.in);

        System.out.println("Simple Intrest = " + principal.nextInt() * time.nextInt() * rate.nextInt());
    }
}
