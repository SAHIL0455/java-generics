package com.brigelabs;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumNumber {
    public static Scanner scanner = new Scanner(System.in);
    public static int first, second, third, fourth;
    public static float first1, second1, third1, fourth1;
    public static String first2, second2, third2, fourth2;

    public static void main(String[] args) {
        System.out.println("Welcome to Generic program");
        getInputForInteger();
        maxParameter(first, second, third, fourth);
        getInputForFloat();
        maxParameter(first1, second1, third1, fourth1);
        getInputForString();
        maxParameter(first2, second2, third2, fourth2);
    }

    public static <T> void maxParameter(T... a) {
        Arrays.sort(a);
        T max = a[a.length - 1];
        printMax(max);
    }

    public static <E> void printMax(E a) {
        System.out.println("Maximum is = " + a);
    }

    private static void getInputForString() {
        System.out.println("Enter the First String");
        first2 = scanner.next();
        System.out.println("Enter the Second String");
        second2 = scanner.next();
        System.out.println("Enter the Third String");
        third2 = scanner.next();
        System.out.println("Enter the Forth String");
        fourth2 = scanner.next();
    }

    private static void getInputForFloat() {
        System.out.println("Enter the First Float Number");
        first1 = scanner.nextFloat();
        System.out.println("Enter the Second Float Number");
        second1 = scanner.nextFloat();
        System.out.println("Enter the Third Float Number");
        third1 = scanner.nextFloat();
        System.out.println("Enter the Forth Float Number");
        fourth1 = scanner.nextFloat();
    }

    private static void getInputForInteger() {
        System.out.println("Enter the First Integer Number");
        first = scanner.nextInt();
        System.out.println("Enter the Second Integer Number");
        second = scanner.nextInt();
        System.out.println("Enter the Third Integer Number");
        third = scanner.nextInt();
        System.out.println("Enter the Forth Integer Number");
        fourth = scanner.nextInt();
    }
}
