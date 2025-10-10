package Week4;

import java.util.Scanner;

public class Factorial {

    // Method to calculate factorial
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long fact = factorial(number);
            System.out.println("Factorial of " + number + " is: " + fact);
        }

        scanner.close();
    }
}

