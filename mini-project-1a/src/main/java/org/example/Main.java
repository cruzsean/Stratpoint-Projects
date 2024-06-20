package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            try {
                //Input Values
                System.out.print("Enter your first number: ");
                double num_1 = scanner.nextInt();
                System.out.print("Enter your second number: ");
                double num_2 = scanner.nextInt();
                //Enter choices
                displaychoices();
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                //calculate
                double result = calculate(num_1, num_2, choice);
                System.out.println("Result: " + result);

                System.out.print("Do you want to perform another calculation? (y/n): ");
                String answer = scanner.next();

                if (!answer.equalsIgnoreCase("y")) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid Input. Make sure to enter numeric values only");
                scanner.nextLine();
            }
        }
        scanner.close();
    }

    public static void displaychoices() {
        System.out.println("Choose an operation: (Choose the corresponding number only)");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
    }

    public static double calculate(double num_1, double num_2, int choice){
        return switch (choice) {
            case 1 -> add(num_1, num_2);
            case 2 -> subtract(num_1, num_2);
            case 3 -> multiply(num_1, num_2);
            case 4 -> divide(num_1, num_2);
            default -> num_1;
        };
    }

    public static double add(double num_1, double num_2){
        return  num_1 + num_2;
    }

    public static double subtract(double num_1, double num_2){
        return  num_1 - num_2;
    }

    public static double multiply(double num_1, double num_2){
        return  num_1 * num_2;
    }

    public static double divide(double num_1, double num_2) {
        if (num_2 != 0) {
            return num_1 / num_2;
        } else {
            System.out.println("Error");
            return 0;
        }
    }
}