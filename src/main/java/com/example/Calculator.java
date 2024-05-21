package com.example;

import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    double number = sc.nextDouble();
    System.out.println("The double of the number is: " + doubleValue(number));
    System.out.println("Is the number odd? " + isOdd(number));
  }

  public static double doubleValue(double number) {
    return number * 2;
  }

  public static boolean isOdd(double number) {
    return number % 2 != 0;
  }
}
