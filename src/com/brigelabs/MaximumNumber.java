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
        int maxInt = maxParameter(first, second, third,fourth);
        System.out.println("maximum number is "+maxInt);
        getInputForFloat();
        float maxfloat = maxParameter(first1, second1, third1,fourth1);
        System.out.println("Maximum number of float is "+maxfloat);
        getInputForString();
        String maxString = maxParameter(first2, second2, third2,fourth2);
        System.out.println("Maximum string is "+maxString);
    }
    public static <T> T maxParameter(T ... a){
        Arrays.sort(a);
        return a[a.length-1];
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
