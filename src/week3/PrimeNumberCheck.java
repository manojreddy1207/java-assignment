package week3;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, i, flag = 0;

        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } else {
            for (i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }

        scanner.close();
    }
}
