package com.brigelabs;

import java.util.Scanner;

public class MaximumNumber {
    public static Scanner scanner = new Scanner(System.in);
    public static int first,second,third;

    public static void main(String[] args) {
        System.out.println("Welcome to Generic program");
        getInput();
        maxIntegers(first,second,third);
    }
    private static void getInput() {
        System.out.println("Enter the First Integer Number");
        first = scanner.nextInt();
        System.out.println("Enter the Second Integer Number");
        second = scanner.nextInt();
        System.out.println("Enter the Third Integer Number");
        third = scanner.nextInt();
    }
    private static void maxIntegers(Integer a,Integer b,Integer c){
        int max = a;
        if (b.compareTo(max)>0){
            max = b;
        }
        if (c.compareTo(max)>0){
            max = c;
        }
        System.out.println("Maximum Number is "+max);
    }
}
