package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Variable Declaration
        while(true) {
            String num_1;
            double num_2;
            int choice;
            double result = 0;
            String answer;


            System.out.print("Enter an arithmetic expression: ");
            num_1 = scanner.nextLine();


            // Display
            System.out.println("Result: " + result);

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            answer = scanner.next();

            if (!answer.equalsIgnoreCase("yes")) {
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }

    public static void parse(String num_1){
        for (int i=0;i<num_1.length();i++){

        }

    }

    public static void displaychoices(){
        System.out.println("Choose an operation: (Choose the corresponding number only)");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
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