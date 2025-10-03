package week3;

public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3, i;

        System.out.println("Fibonacci Series till 10 numbers:");
        System.out.print(n1 + " " + n2 + " "); // print first two numbers

        for (i = 3; i <= 10; i++) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }
}

