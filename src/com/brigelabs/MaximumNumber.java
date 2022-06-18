package com.brigelabs;

import java.util.Scanner;

public class MaximumNumber {
    public static Scanner scanner = new Scanner(System.in);
    public static int first, second, third;
    public static float first1, second1, third1;
    public static String first2, second2, third2;

    public static void main(String[] args) {
        System.out.println("Welcome to Generic program");
        getInputForInteger();
        maxIntegers(first, second, third);
        getInputForFloat();
        maxFloat(first1, second1, third1);
        getInputForString();
        maxString(first2, second2, third2);
    }

    private static void maxString(String first2, String second2, String third2) {
        if ((second2.length() > first2.length()) && (second2.length() > third2.length())) {
            System.out.println("Maximum String is " + second2);
        } else if ((third2.length() > first2.length()) && (third2.length() > second2.length())) {
            System.out.println("Maximum String is " + third2);
        } else {
            System.out.println("Maximum String is " + first2);
        }
    }

    private static void getInputForString() {
        System.out.println("Enter the First String");
        first2 = scanner.next();
        System.out.println("Enter the Second String");
        second2 = scanner.next();
        System.out.println("Enter the Third String");
        third2 = scanner.next();
    }

    private static void maxFloat(Float first1, Float second1, Float third1) {
        float max = first1;
        if (second1.compareTo(max) > 0) {
            max = second1;
        }
        if (third1.compareTo(max) > 0) {
            max = third1;
        }
        System.out.println("Maximum Number is Float " + max);
    }

    private static void getInputForFloat() {
        System.out.println("Enter the First Float Number");
        first1 = scanner.nextFloat();
        System.out.println("Enter the Second Float Number");
        second1 = scanner.nextFloat();
        System.out.println("Enter the Third Float Number");
        third1 = scanner.nextFloat();
    }

    private static void getInputForInteger() {
        System.out.println("Enter the First Integer Number");
        first = scanner.nextInt();
        System.out.println("Enter the Second Integer Number");
        second = scanner.nextInt();
        System.out.println("Enter the Third Integer Number");
        third = scanner.nextInt();
    }

    private static void maxIntegers(Integer a, Integer b, Integer c) {
        int max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        System.out.println("Maximum Number is Integer " + max);
    }
}
