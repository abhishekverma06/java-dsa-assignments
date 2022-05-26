package com.dsa.assignments;

import java.util.Scanner;

/**
 * @author Abhishek
 */
public class PerformUserInputOperations {
    public static void main(String[] args) {
        System.out.println("Enter 1st numbers");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Enter 2nd numbers");
        int b = new Scanner(System.in).nextInt();
        System.out.println("Enter operator");
        Scanner c = new Scanner(System.in);
        String operator = c.next();
        if (operator.equals("+")) {
            System.out.println(a + b);
            return;
        }
        if (operator.equals("-")) {
            System.out.println(a - b);
            return;
        }
        if (operator.equals("*")) {
            System.out.println(a * b);
            return;
        }
        if (operator.equals("/")) {
            System.out.println(a / b);
            return;
        }
    }
}
