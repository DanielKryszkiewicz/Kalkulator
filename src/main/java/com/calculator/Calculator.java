package com.calculator;

import java.util.Scanner;

public class Calculator {


    public void addition (int a,int b) {
        System.out.println(a + b);
    }

    public void subtraction (int a, int b) {
        System.out.println(a - b);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator();
        System.out.println("Please enter numbers you want to add: ");
        calculator.addition(scanner.nextInt(), scanner.nextInt());

        System.out.println("Please enter numbers you want to subtract: ");
        calculator.subtraction(scanner.nextInt(), scanner.nextInt());

        }
    }



