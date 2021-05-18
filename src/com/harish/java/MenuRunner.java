package com.harish.java;

import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {
        // Scanner(System.in) // user input
        // type object = new type(argument);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1: "); // user output
        int number1 = scanner.nextInt();
        System.out.println("The Number you entered is " + number1);

        int number2 = scanner.nextInt();
        System.out.println("The Number you enter is" + number2);

        System.out.println("choice Avaibale are ");
        System.out.println("1- Add");
        System.out.println("2- subtract");
        System.out.println("3- divide");
        System.out.println("3- multiply");

        System.out.println("Enter choice:");
        int choice = scanner.nextInt();
        System.out.println("Your choices are");
        System.out.println("Number1" + number1);
        System.out.println("Number2" + number2);
        System.out.println("choice" + choice);
        if (choice == 1) {
            System.out.println("Result" + (number1 + number2));
        } else if (choice == 2) {
            System.out.println("Result" + (number1 - number2));
        } else if (choice == 3) {
            System.out.println("Result" + (number1 / number2));
        } else if (choice == 4) {
            System.out.println("Result" + (number1 * number2));
        } else {
            System.out.println("Invalid Operation");
        }

    }
}
