package week3;

import java.util.Scanner;

public class BasicCalc {
    public static void main(String[] args) {

        int num01, num02, result;
        char operator;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number 01");
        num01 = input.nextInt();
        System.out.println("Enter Number 02");
        num02 = input.nextInt();
        System.out.println("Enter Operator");
        operator = input.next().charAt(0);

        switch(operator) {

            case '+':
                result = num01 + num02;
                System.out.println("Result is "+ result);
                break;
            case '-':
                result = num01 - num02;
                System.out.println("Result is "+ result);
                break;
            case '*':
                result = num01 * num02;
                System.out.println("Result is "+ result);
                break;

            case '/':
                result = num01 / num02;
                System.out.println("Result is "+ result);
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }


    }
}
